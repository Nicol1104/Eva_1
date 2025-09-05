/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author nikol
 */
public class Eva1_13_if {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaraciones de variables 
      double cali;
      Scanner cap = new Scanner(System.in);
       
        //captura
     System.out.println("Introduce la calificacion");
     cali=cap.nextDouble();
    //estructura de control de if-then-else 
     if(cali>=70){
     System.out.println("Felizidades, acreditastes!!");
     }else{ //seccion (opcional)
         System.out.println("azotes!!");
    }
    
}
}