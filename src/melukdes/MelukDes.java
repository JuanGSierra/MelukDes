/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package melukdes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

/**
 *
 * @author Juan
 */
public class MelukDes {

    /**
     * @param args the command line arguments
     */
    public String leerTxt() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Juan\\Documents\\NetBeansProjects\\MelukDes\\src\\melukdes\\file.txt")))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

            String everything = sb.toString();

            br.close();
            return everything;
        } catch (Exception e) {
            return e.toString();
        }

    }

    public void leer(String arregloPalabras) {

        String[] dividido = arregloPalabras.split("\\s+");

        for (int i = 0; i < dividido.length; i++) {
            //System.out.println(dividido[i]);
            if (dividido[i].length() >= 5) {
                String dude = dividido[i].substring(0, 4);
                if (dividido[i].startsWith("Loop")) {
                    System.out.println("Aqui encontro algo dude");
                }
                if (dividido[i].equalsIgnoreCase("loop1")) {
                    System.out.println("coge mayusculas?");
                }
                System.out.println(dude);

            }

        }
    }

    public static void main(String[] args) {
        MelukDes prueba = new MelukDes();
        prueba.leer(prueba.leerTxt());
    }

}
