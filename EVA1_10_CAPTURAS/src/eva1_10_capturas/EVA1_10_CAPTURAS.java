/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_capturas;

import java.util.Scanner;

/**
 *
 * @author aylin
 */
public class EVA1_10_CAPTURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SOLICITAR LA TEMPERATURA EN FARENHEIT
        Scanner input = new Scanner(System.in);
        double far, cent;
        //captura:
        System.out.println("TEMPERATUTRA EN GRADOS FAR:");
        far = input.nextDouble();
        
        //DARLE LA TEMPERATURA EN GRADOS CENTIGRADOS
        cent = 5*(far -32)/9;
        System.out.println("temperatura es:");
        System.out.println(cent);
                
        
    }
    
}
