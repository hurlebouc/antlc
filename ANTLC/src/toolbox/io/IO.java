/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package toolbox.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hubert
 */
public class IO {
    
    private static String lireFichier2(String nomFichier, InputStreamReader ir) {
        String resultat = "";
        try {
            int a;
            while ((a = ir.read()) != -1) {
                resultat = resultat + (char) a;
            }
            ir.close();
        } catch (IOException e) {
            System.out.println("Fichier.lireFichier" + e.toString());
        }
        return resultat;
    }
    
    public static String lireFichier(String nomFichier) {
        try {
            FileReader fr = new FileReader(nomFichier);
            return lireFichier2(nomFichier, fr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return "";
    }
    
    public static void ecrireFichier(String nomFichier, String aEcrire) {
        try {
            FileWriter fw = new FileWriter(nomFichier);
            fw.write(aEcrire, 0, aEcrire.length());
            fw.close();
        } catch (IOException e) {
            System.out.println("could not write the file" + nomFichier);
        }
    }
    
}
