//**************************************************************************//
/*  CROCUS - a synthesizer of quasi-interpretation of first order programs  */
/*                                                                        	*/
/*  Copyright 2005-2008 INRIA, INPL                 						*/
/*                                                                        	*/
/*  More information on "http://www.loria.fr/equipes/carte/crocus"  		*/
/*  License: CeCILL, see LICENSE file or "http://www.cecill.info"         	*/
/*  Authors: Guillaume Bonfante                                             */
//**************************************************************************//

package utilitaire;
// Decompiled by Jad v1.5.8c. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ConsoleCanvas.java

import java.awt.*;

public class ConsoleCanvas extends Canvas
{

    public ConsoleCanvas()
    {
        typeAhead = new StringBuffer();
        hasFocus = false;
        cursorIsVisible = false;
        pos = 0;
    }

    public final String readLine()
    {
        return doReadLine();
    }

    public final void addChar(char ch)
    {
        putChar(ch);
    }

    public final void addCR()
    {
        putCR();
    }

    public synchronized void clear()
    {
        if(OSC == null)
            return;
        currentRow = 0;
        currentCol = 0;
        OSCGraphics.setColor(Color.white);
        OSCGraphics.fillRect(4, 4, getWidth() - 8, getHeight() - 8);
        OSCGraphics.setColor(Color.black);
        repaint();
        try
        {
            Thread.sleep(0L);
        }
        catch(InterruptedException interruptedexception) { }
    }

    public boolean keyDown(Event evt, int ch)
    {
        doKey((char)ch);
        return true;
    }

    public boolean gotFocus(Event evt, Object what)
    {
        doFocus(true);
        return true;
    }

    public boolean lostFocus(Event evt, Object what)
    {
        doFocus(false);
        return true;
    }

    public synchronized void clearTypeAhead()
    {
        typeAhead.setLength(0);
        pos = -1;
        notify();
    }

    protected synchronized String doReadLine()
    {
        if(OSC == null)
            try
            {
                wait(0L);
            }
            catch(InterruptedException interruptedexception) { }
        if(OSC == null)
            doSetup();
        if(!hasFocus)
            requestFocus();
        StringBuffer lineBuffer = new StringBuffer();
        pos = 0;
        do
        {
            while(pos >= typeAhead.length()) 
            {
                cursorBlink();
                try
                {
                    wait(0L);
                }
                catch(InterruptedException interruptedexception1) { }
            }
            if(pos == -1)
                return "";
            if(cursorIsVisible)
                cursorBlink();
            if(typeAhead.charAt(pos) == '\r' || typeAhead.charAt(pos) == '\n')
            {
                putCR();
                pos++;
                break;
            }
            if(typeAhead.charAt(pos) == '\b' || typeAhead.charAt(pos) == '\177')
            {
                if(lineBuffer.length() > 0)
                {
                    lineBuffer.setLength(lineBuffer.length() - 1);
                    eraseChar();
                }
                pos++;
            } else
            if(typeAhead.charAt(pos) >= ' ' && typeAhead.charAt(pos) < '\177')
            {
                putChar(typeAhead.charAt(pos));
                lineBuffer.append(typeAhead.charAt(pos));
                pos++;
            } else
            {
                pos++;
            }
            if(lineBuffer.length() != 256)
                continue;
            putCR();
            pos = typeAhead.length();
            break;
        } while(true);
        if(pos >= typeAhead.length())
        {
            typeAhead.setLength(0);
        } else
        {
            int len = typeAhead.length();
            for(int i = pos; i < len; i++)
                typeAhead.setCharAt(i - pos, typeAhead.charAt(i));

            typeAhead.setLength(len - pos);
        }
        return lineBuffer.toString();
    }

    protected synchronized void doKey(char ch)
    {
        typeAhead.append(ch);
        notify();
    }

    private void putCursor(Graphics g)
    {
        g.drawLine(leftOffset + currentCol * charWidth + 1, topOffset + currentRow * lineHeight, leftOffset + currentCol * charWidth + 1, topOffset + (currentRow * lineHeight + baseOffset));
    }

    protected synchronized void putChar(char ch)
    {
        if(OSC == null)
            try
            {
                wait(0L);
            }
            catch(InterruptedException interruptedexception) { }
        if(OSC == null)
            doSetup();
        if(currentCol >= columns)
            putCR();
        currentCol++;
        Graphics g = getGraphics();
        g.setColor(Color.black);
        g.setFont(font);
        char fudge[] = new char[1];
        fudge[0] = ch;
        g.drawChars(fudge, 0, 1, leftOffset + (currentCol - 1) * charWidth, topOffset + currentRow * lineHeight + baseOffset);
        OSCGraphics.drawChars(fudge, 0, 1, leftOffset + (currentCol - 1) * charWidth, topOffset + currentRow * lineHeight + baseOffset);
    }

    protected void eraseChar()
    {
        if(currentCol == 0 && currentRow == 0)
            return;
        currentCol--;
        if(currentCol < 0)
        {
            currentRow--;
            currentCol = columns - 1;
        }
        Graphics g = getGraphics();
        g.setColor(Color.white);
        g.fillRect(leftOffset + currentCol * charWidth, topOffset + currentRow * lineHeight, charWidth, lineHeight - 1);
        OSCGraphics.setColor(Color.white);
        OSCGraphics.fillRect(leftOffset + currentCol * charWidth, topOffset + currentRow * lineHeight, charWidth, lineHeight - 1);
        OSCGraphics.setColor(Color.black);
    }

    protected synchronized void putCR()
    {
        if(OSC == null)
            try
            {
                wait(0L);
            }
            catch(InterruptedException interruptedexception) { }
        if(OSC == null)
            doSetup();
        currentCol = 0;
        currentRow++;
        if(currentRow < rows)
            return;
        rows++;
        setSize(getWidth(), getHeight() + lineHeight);
        doReSetup();
        repaint();
        try
        {
            Thread.sleep(0L);
        }
        catch(InterruptedException interruptedexception1) { }
    }

    protected void cursorBlink()
    {
        if(cursorIsVisible)
        {
            Graphics g = getGraphics();
            g.setColor(Color.white);
            putCursor(g);
            cursorIsVisible = false;
            g.dispose();
        } else
        if(hasFocus)
        {
            Graphics g = getGraphics();
            g.setColor(Color.black);
            putCursor(g);
            cursorIsVisible = true;
            g.dispose();
        }
    }

    protected synchronized void doFocus(boolean focus)
    {
        if(OSC == null)
            doSetup();
        hasFocus = focus;
        if(hasFocus)
            OSCGraphics.setColor(Color.cyan);
        else
            OSCGraphics.setColor(Color.white);
        int w = getWidth();
        int h = getHeight();
        for(int i = 0; i < 3; i++)
            OSCGraphics.drawRect(i, i, w - 2 * i, h - 2 * i);

        OSCGraphics.drawLine(0, h - 3, w, h - 3);
        OSCGraphics.drawLine(w - 3, 0, w - 3, h);
        OSCGraphics.setColor(Color.black);
        repaint();
        try
        {
            Thread.sleep(0L);
        }
        catch(InterruptedException interruptedexception) { }
        notify();
    }

    protected void doSetup()
    {
        int w = getWidth();
        int h = getHeight();
        font = new Font("Courier", 0, getFont().getSize());
        FontMetrics fm = getFontMetrics(font);
        lineHeight = fm.getHeight();
        leading = fm.getLeading();
        baseOffset = fm.getAscent();
        charWidth = fm.charWidth('W');
        columns = (w - 12) / charWidth;
        rows = ((h - 12) + leading) / lineHeight;
        leftOffset = (w - columns * charWidth) / 2;
        topOffset = ((h + leading) - rows * lineHeight) / 2;
        OSC = createImage(w, h);
        OSCGraphics = OSC.getGraphics();
        OSCGraphics.setFont(font);
        OSCGraphics.setColor(Color.white);
        OSCGraphics.fillRect(0, 0, w, h);
        OSCGraphics.setColor(Color.black);
        notify();
    }

    protected void doReSetup()
    {
        int w = getWidth();
        int h = getHeight();
        topOffset = ((h + leading) - rows * lineHeight) / 2;
        Image OSCTemp = createImage(w, h);
        Graphics OSCGraphicsTemp = OSCTemp.getGraphics();
        OSCGraphicsTemp.setFont(font);
        OSCGraphicsTemp.setColor(Color.white);
        OSCGraphicsTemp.drawImage(OSC, 0, 0, this);
        OSCGraphicsTemp.fillRect(3, topOffset + (rows - 1) * lineHeight, w - 3, lineHeight * 2);
        if(hasFocus)
            OSCGraphicsTemp.setColor(Color.cyan);
        else
            OSCGraphicsTemp.setColor(Color.white);
        for(int i = 0; i < 3; i++)
            OSCGraphicsTemp.drawRect(i, i, w - 2 * i, h - 2 * i);

        OSCGraphicsTemp.setColor(Color.black);
        OSCGraphics = OSCGraphicsTemp;
        OSC = OSCTemp;
        notify();
    }

    public void update(Graphics g)
    {
        getParent().getParent().validate();
        paint(g);
    }

    public synchronized void paint(Graphics g)
    {
        if(OSC == null)
            doSetup();
        g.drawImage(OSC, 0, 0, this);
    }

    protected StringBuffer typeAhead;
    protected final int maxLineLength = 256;
    protected int rows;
    protected int columns;
    protected int currentRow;
    protected int currentCol;
    protected Font font;
    protected int lineHeight;
    protected int baseOffset;
    protected int charWidth;
    protected int leading;
    protected int topOffset;
    protected int leftOffset;
    protected Image OSC;
    protected Graphics OSCGraphics;
    protected boolean hasFocus;
    protected boolean cursorIsVisible;
    private int pos;
}
