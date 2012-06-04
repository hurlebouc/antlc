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
// Source File Name:   Utilitaire.java

import java.awt.Event;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Utilitaire extends JApplet
{

    private Utilitaire()
    {
        this(800, 800);
    }

    private Utilitaire(int width, int height)
    {
        buffer = null;
        pos = 0;
        monSingleton = this;
        canvas = new ConsoleCanvas();
        if(width > 50 && height > 50)
            canvas.setSize(width - 50, height - 50);
        else
            canvas.setSize(width, height);
        myPanel = new JPanel();
        myPanel.add("Center", canvas);
        myScrollPane = new JScrollPane(myPanel);
        getContentPane().add("Center", myScrollPane);
        resize(width, height);
        setVisible(true);
    }

    public void put(int x)
    {
        put(x, 0);
    }

    public void put(long x)
    {
        put(x, 0);
    }

    public void put(double x)
    {
        put(x, 0);
    }

    public void put(char x)
    {
        put(x, 0);
    }

    public void put(boolean x)
    {
        put(x, 0);
    }

    public void put(String x)
    {
        put(x, 0);
    }

    public void putln(int x)
    {
        put(x, 0);
        newLine();
    }

    public void putln(long x)
    {
        put(x, 0);
        newLine();
    }

    public void putln(float x)
    {
        put(x, 0);
        newLine();
    }

    public void putln(double x)
    {
        put(x, 0);
        newLine();
    }

    public void putln(char x)
    {
        put(x, 0);
        newLine();
    }

    public void putln(boolean x)
    {
        put(x, 0);
        newLine();
    }

    public void putln(String x)
    {
        put(x, 0);
        newLine();
    }

    public void putln(int x, int w)
    {
        put(x, w);
        newLine();
    }

    public void putln(long x, int w)
    {
        put(x, w);
        newLine();
    }

    public void putln(float x, int w)
    {
        put(x, w);
        newLine();
    }

    public void putln(double x, int w)
    {
        put(x, w);
        newLine();
    }

    public void putln(char x, int w)
    {
        put(x, w);
        newLine();
    }

    public void putln(boolean x, int w)
    {
        put(x, w);
        newLine();
    }

    public void putln(String x, int w)
    {
        put(x, w);
        newLine();
    }

    public void putln()
    {
        newLine();
    }

    public void put(int x, int w)
    {
        dumpString(String.valueOf(x), w);
    }

    public void put(long x, int w)
    {
        dumpString(String.valueOf(x), w);
    }

    public void put(float x, int w)
    {
        dumpString(String.valueOf(x), w);
    }

    public void put(double x, int w)
    {
        dumpString(String.valueOf(x), w);
    }

    public void put(char x, int w)
    {
        dumpString(String.valueOf(x), w);
    }

    public void put(boolean x, int w)
    {
        dumpString(String.valueOf(x), w);
    }

    public void put(String x, int w)
    {
        dumpString(x, w);
    }

    public byte getlnByte()
    {
        byte x = getByte();
        emptyBuffer();
        return x;
    }

    public short getlnShort()
    {
        short x = getShort();
        emptyBuffer();
        return x;
    }

    public int getlnInt()
    {
        int x = getInt();
        emptyBuffer();
        return x;
    }

    public long getlnLong()
    {
        long x = getLong();
        emptyBuffer();
        return x;
    }

    public float getlnFloat()
    {
        float x = getFloat();
        emptyBuffer();
        return x;
    }

    public double getlnDouble()
    {
        double x = getDouble();
        emptyBuffer();
        return x;
    }

    public char getlnChar()
    {
        char x = getChar();
        emptyBuffer();
        return x;
    }

    public boolean getlnBoolean()
    {
        boolean x = getBoolean();
        emptyBuffer();
        return x;
    }

    public String getlnWord()
    {
        String x = getWord();
        emptyBuffer();
        return x;
    }

    public String getlnString()
    {
        return getln();
    }

    public String getln()
    {
        StringBuffer s = new StringBuffer(100);
        for(char ch = readChar(); ch != '\n'; ch = readChar())
            s.append(ch);

        return s.toString();
    }

    public byte getByte()
    {
        return (byte)(int)readInteger(-1L, 0L);
    }

    public short getShort()
    {
        return (short)(int)readInteger(-1L, 0L);
    }

    public int getInt()
    {
        return (int)readInteger(0xffffffffL, 0x0L);
    }

    public long getLong()
    {
        return readInteger(0x80000000L, 0x7fffffffL);
    }

    public char getChar()
    {
        return readChar();
    }

    public char peek()
    {
        return lookChar();
    }

    public float getFloat()
    {
        float x = 0.0F;
        do
        {
            String str = readRealString();
            if(str.equals(""))
            {
                errorMessage("Valeur d'entree reelle non valide.", "Un nombre reel (float) peut prendre une valeur entre 1.4E-45 et 3.4028235E38");
                continue;
            }
            Float f = null;
            try
            {
                f = Float.valueOf(str);
            }
            catch(NumberFormatException e)
            {
                errorMessage("Valeur d'entree reelle non valide.", "Un nombre reel (float) peut prendre une valeur entre 1.4E-45 et 3.4028235E38");
                continue;
            }
            if(f.isInfinite())
            {
                errorMessage("Valeur d'entree reelle non valide.", "Un nombre reel (float) peut prendre une valeur entre 1.4E-45 et 3.4028235E38");
            } else
            {
                x = f.floatValue();
                return x;
            }
        } while(true);
    }

    public double getDouble()
    {
        double x = 0.0D;
        do
        {
            String str = readRealString();
            if(str.equals(""))
            {
                errorMessage("Valeur d'entree reelle non valide.", "Un nombre reel (double) peut prendre une valeur entre 4.9E-324 et 1.7976931348623157E308");
                continue;
            }
            Double f = null;
            try
            {
                f = Double.valueOf(str);
            }
            catch(NumberFormatException e)
            {
                errorMessage("Valeur d'entree reelle non valide.", "Un nombre reel (double) peut prendre une valeur entre 4.9E-324 et 1.7976931348623157E308");
                continue;
            }
            if(f.isInfinite())
            {
                errorMessage("Valeur d'entree reelle non valide.", "Un nombre reel (double) peut prendre une valeur entre 4.9E-324 et 1.7976931348623157E308");
            } else
            {
                x = f.doubleValue();
                return x;
            }
        } while(true);
    }

    public String getWord()
    {
        char ch;
        for(ch = lookChar(); ch == ' ' || ch == '\n'; ch = lookChar())
        {
            readChar();
            if(ch == '\n')
                dumpString("? ", 0);
        }

        StringBuffer str = new StringBuffer(50);
        for(; ch != ' ' && ch != '\n'; ch = lookChar())
            str.append(readChar());

        return str.toString();
    }

    public boolean getBoolean()
    {
        boolean ans = false;
        do
        {
            String s = getWord();
            if(s.equalsIgnoreCase("true") || s.equalsIgnoreCase("t") || s.equalsIgnoreCase("yes") || s.equalsIgnoreCase("y") || s.equals("1") || s.equalsIgnoreCase("oui"))
            {
                ans = true;
                break;
            }
            if(s.equalsIgnoreCase("false") || s.equalsIgnoreCase("f") || s.equalsIgnoreCase("no") || s.equalsIgnoreCase("n") || s.equals("0") || s.equalsIgnoreCase("non"))
            {
                ans = false;
                break;
            }
            errorMessage("Valeur booleenne non valide", "Veuillez choisir parmi:  true, false, t, f, yes, no, y, n, oui, non, 0, or 1");
        } while(true);
        return ans;
    }

    public boolean gotFocus(Event evt, Object what)
    {
        System.out.println("getting the focus");
        canvas.requestFocus();
        return true;
    }

    private String readRealString()
    {
        StringBuffer s = new StringBuffer(50);
        char ch;
        for(ch = lookChar(); ch == ' ' || ch == '\n'; ch = lookChar())
        {
            readChar();
            if(ch == '\n')
                dumpString("? ", 0);
        }

        if(ch == '-' || ch == '+')
        {
            s.append(readChar());
            for(ch = lookChar(); ch == ' '; ch = lookChar())
                readChar();

        }
        for(; ch >= '0' && ch <= '9'; ch = lookChar())
            s.append(readChar());

        if(ch == '.')
        {
            s.append(readChar());
            for(ch = lookChar(); ch >= '0' && ch <= '9'; ch = lookChar())
                s.append(readChar());

        }
        if(ch == 'E' || ch == 'e')
        {
            s.append(readChar());
            ch = lookChar();
            if(ch == '-' || ch == '+')
            {
                s.append(readChar());
                ch = lookChar();
            }
            for(; ch >= '0' && ch <= '9'; ch = lookChar())
                s.append(readChar());

        }
        return s.toString();
    }

    private long readInteger(long min, long max)
    {
        long x = 0L;
        do
        {
            StringBuffer s = new StringBuffer(34);
            char ch;
            for(ch = lookChar(); ch == ' ' || ch == '\n'; ch = lookChar())
            {
                readChar();
                if(ch != '\n');
                dumpString("? ", 0);
            }

            if(ch == '-' || ch == '+')
            {
                s.append(readChar());
                for(ch = lookChar(); ch == ' '; ch = lookChar())
                    readChar();

            }
            for(; ch >= '0' && ch <= '9'; ch = lookChar())
                s.append(readChar());

            if(s.equals(""))
            {
                errorMessage("Valeur entiere non valide.", "Un entier peut prendre des valeurs de " + min + " jusqu' " + max);
                continue;
            }
            String str = s.toString();
            try
            {
                x = Long.parseLong(str);
            }
            catch(NumberFormatException e)
            {
                errorMessage("Valeur entiere non valide.", "Un entier peut prendre des valeurs de " + min + " jusqu' " + max);
                continue;
            }
            if(x < min || x > max)
                errorMessage("Valeur entiere non valide.", "Un entier peut prendre des valeurs de " + min + " jusqu' " + max);
            else
                return x;
        } while(true);
    }

    private void dumpString(String str, int w)
    {
        for(int i = str.length(); i < w; i++)
            canvas.addChar(' ');

        for(int i = 0; i < str.length(); i++)
            if(str.charAt(i) == '\t')
            {
                String strTemp = "";
                String strTemp2 = "";
                int positionTab = 8 - i % 8;
                strTemp = str.substring(0, i);
                strTemp2 = str.substring(i + 1);
                for(int nEspaces = 0; nEspaces < positionTab; nEspaces++)
                    strTemp = strTemp + " ";

                str = strTemp + strTemp2;
            }

        for(int i = 0; i < str.length(); i++)
            if(str.charAt(i) >= ' ' && str.charAt(i) != '\177')
                canvas.addChar(str.charAt(i));
            else
            if(str.charAt(i) == '\n' || str.charAt(i) == '\r')
                newLine();

    }

    private void errorMessage(String message, String expecting)
    {
        newLine();
        dumpString("  *** Erreur dans la valeur saisie : " + message + "\n", 0);
        dumpString("  *** Remarque : " + expecting + "\n", 0);
        dumpString("  *** La valeur suivante est ignoree : ", 0);
        if(lookChar() == '\n')
        {
            dumpString("(fin de ligne)\n\n", 0);
        } else
        {
            for(; lookChar() != '\n'; canvas.addChar(readChar()));
            dumpString("\n\n", 0);
        }
        dumpString("Veuillez ressaisir une valeur correcte : ", 0);
        readChar();
    }

    private void errorMessage2(String message, String expecting, String mauvaiseValeur)
    {
        newLine();
        dumpString("  *** Erreur dans la valeur saisie : " + message + "\n", 0);
        dumpString("  *** Remarque : " + expecting + "\n", 0);
        dumpString("  *** La valeur suivante est ignoree : " + mauvaiseValeur, 0);
        dumpString("(fin de ligne)\n\n", 0);
        dumpString("Veuillez ressaisir une valeur correcte : ", 0);
    }

    private char lookChar()
    {
        if(buffer == null || pos > buffer.length())
            fillBuffer();
        if(pos == buffer.length())
            return '\n';
        else
            return buffer.charAt(pos);
    }

    private char readChar()
    {
        char ch = lookChar();
        pos++;
        return ch;
    }

    private void newLine()
    {
        canvas.addCR();
    }

    private void fillBuffer()
    {
        buffer = canvas.readLine();
        pos = 0;
    }

    private void emptyBuffer()
    {
        buffer = null;
    }

    public static void main(String args[])
    {
        demarrer();
    }

    public static void demarrer()
    {
        if(monSingleton == null)
        {
            java.awt.Component applet = new Utilitaire();
            JFrame maFrame = new JFrame("Console Java");
            maFrame.setSize(800, 800);
            maFrame.getContentPane().add(applet);
            maFrame.setDefaultCloseOperation(3);
            maFrame.setResizable(false);
            maFrame.show();
        }
        try
        {
            Thread.sleep(0L);
        }
        catch(Exception e)
        {
            System.out.println("trop lent");
        }
    }

    public static void ecrire()
    {
        ecrire("");
    }

    public static void ecrire(String uneChaine)
    {
        demarrer();
        monSingleton.put(">" + uneChaine);
    }

    public static void ecrire(int x)
    {
        ecrire(Integer.toString(x));
    }

    public static void ecrire(double x)
    {
        ecrire(Double.toString(x));
    }

    public static void ecrire(float x)
    {
        ecrire(Float.toString(x));
    }

    public static void ecrire(boolean b)
    {
        ecrire(Boolean.toString(b));
    }

    public static void ecrireLigne(String uneChaine)
    {
        ecrire(uneChaine);
        monSingleton.putln();
    }

    public static void ecrireLigne(int unEntier)
    {
        ecrireLigne(String.valueOf(unEntier));
    }

    public static void ecrireLigne(double unReel)
    {
        ecrireLigne(String.valueOf(unReel));
    }

    public static void ecrireLigne(boolean b)
    {
        ecrireLigne(Boolean.toString(b));
    }

    public static void ecrireLigne()
    {
        ecrireLigne("");
    }

    public static String lireChaine()
    {
        return lireChaine("");
    }
    
    public static String lireChaine(String uneChaine)
    {
        demarrer();
        monSingleton.put(uneChaine + ">");
        return monSingleton.getlnString();
    }
 
    
    public static int lireEntier(String uneChaine)
    {
        String chaine = lireChaine(uneChaine);
        return Integer.parseInt(chaine);
    }

    public static int lireEntier()
    {
        return lireEntier("");
    }

    public static double lireReel(String uneChaine)
    {
        String chaine = lireChaine(uneChaine);
        return Double.parseDouble(chaine);
    }

    public static double lireReelDouble(String uneChaine)
    {
        String chaine = lireChaine(uneChaine);
        return Double.parseDouble(chaine);
    }

    public static float lireReelFloat(String uneChaine)
    {
        String chaine = lireChaine(uneChaine);
        return Float.parseFloat(chaine);
    }

    public static double tirerUnReel()
    {
        return Math.random();
    }

    public static double tirerUnReel(double borneMax)
    {
        return Math.random() * borneMax;
    }

    public static int tirerUnEntier()
    {
        int resultat = (int) Math.floor(Math.random() * Integer.MAX_VALUE);
        return resultat;
    }

    public static int tirerUnEntier(int borneMax)
    {
        int resultat = (int) Math.floor(Math.random() * borneMax);
        return resultat;
    }

    public static boolean tirerUnBooleen()
    {
        boolean resultat = Math.random() >= 0.5D;
        return resultat;
    }
    
    //tire un booleen avec une piece biaisee
    public static boolean tirerUnBooleen(double seuil){
        boolean resultat = Math.random() <= seuil;
        return resultat;
    }

    public boolean keyDown(Event evt, int ch)
    {
        return canvas.keyDown(evt, ch);
    }

    public boolean lostFocus(Event evt, Object what)
    {
        return canvas.lostFocus(evt, what);
    }

    private static String lireFichier2(String nomFichier, InputStreamReader ir)
    {
        String resultat = "";
        try
        {
            int a;
            while((a = ir.read()) != -1) 
                resultat = resultat + (char)a;
            ir.close();
        }
        catch(IOException e)
        {
            System.out.println("Fichier.lireFichier" + e.toString());
        }
        return resultat;
    }

    public static String lireURL(String url)
    {
        try
        {
            URL u = new URL(url);
            InputStreamReader ir = new InputStreamReader(u.openStream());
            return lireFichier2(url, ir);
        }
        catch(MalformedURLException e)
        {
            e.printStackTrace();
            return "";
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        return "";
    }

    public static  InputStreamReader getFile(String nomFichier){
    	try
        {
            FileReader fr = new FileReader(nomFichier);
            return fr;
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return null;
    }
    
    public static String lireFichier(String nomFichier)
    {
        try
        {
            FileReader fr = new FileReader(nomFichier);
            return lireFichier2(nomFichier, fr);
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return "";
    }

    public static void ecrireFichier(String nomFichier, String aEcrire)
    {
        try
        {
            FileWriter fw = new FileWriter(nomFichier);
            fw.write(aEcrire, 0, aEcrire.length());
            fw.close();
        }
        catch(IOException e)
        {
            System.out.println("could not write the file" + nomFichier);
        }
    }
    
    public static void ajouteFichier(String nomFichier, String aEcrire){
        try
        {
            FileWriter fw = new FileWriter(nomFichier,true);
            fw.write(aEcrire, 0, aEcrire.length());
            fw.close();
        }
        catch(IOException e)
        {
            System.out.println("could not write the file" + nomFichier);
        }
	
    }
    
    
    private static Utilitaire monSingleton = null;
    private JScrollPane myScrollPane;
    private JPanel myPanel;
    private ConsoleCanvas canvas;
    private String buffer;
    private int pos;

}
