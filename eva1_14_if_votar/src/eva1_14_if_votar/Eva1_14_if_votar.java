/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_if_votar;

import java.util.Scanner;

/**
 *
 * @author nikol
 */
public class Eva1_14_if_votar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad,año_nacimiento;
        Scanner captu = new Scanner (System.in);
        
        //captura
        
     System.out.println("Captura tu año de nacimiento: ");
     año_nacimiento=captu.nextInt();
     edad=2025-año_nacimiento;
     if(año_nacimiento>=18){
      //estructura de control de if-then-else 
      System.out.println("Podras votar!!");
     }else{
         System.out.println("No puedes votar.menor de edad !!");
    }
    
}
}
