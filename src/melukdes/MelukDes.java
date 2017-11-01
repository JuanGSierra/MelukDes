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
    
    public static void main(String[] args) {
        MelukDes prueba = new MelukDes();
        String[] dividido = prueba.leerTxt().split("\\s+");
        int contadorDeMemoria = 00;
        
        for (int i = 0; i < dividido.length; i++) {
            
            // Comando actual que se esta leyendo
            String aux = dividido[i]; 
            
            // si es un .code o .data
            if (aux.startsWith(".")) {
                
                
                
               
                
             // esto es un número o valor NO CREO QUE LO NECESITEMOS   
            } else if (aux.startsWith("0")) {
                
            } // aca es si es un loop + algun numero
            else if (dividido[i].length() >= 5) {
                
                if (dividido[i].startsWith("Loop")) {
                    System.out.println("Aqui encontro algo dude");
                }
                if (dividido[i].equalsIgnoreCase("loop1")) {
                    System.out.println("coge mayusculas?");
                }
                System.out.println(dude);
                
            } else {
                
                if (dividido[i].equalsIgnoreCase("ldi")) {
                    
                } else if (dividido[i].equalsIgnoreCase("ld")) {
                    
                } else if (dividido[i].equalsIgnoreCase("st")) {
                    
                } else if (dividido[i].equalsIgnoreCase("add")) {
                    
                } else if (dividido[i].equalsIgnoreCase("inc")) {
                    
                } else if (dividido[i].equalsIgnoreCase("neg")) {
                    
                } else if (dividido[i].equalsIgnoreCase("sub")) {
                    
                } else if (dividido[i].equalsIgnoreCase("jmp")) {
                    
                } else if (dividido[i].equalsIgnoreCase("jz")) {
                    
                } else if (dividido[i].equalsIgnoreCase("jn")) {
                    
                }
                
            }
            
        }
        
    }
    
}
