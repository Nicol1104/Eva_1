/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_camptura;

import java.util.Scanner;

/**
 *
 * @author nikol
 */
public class Eva1_9_camptura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        int edad;
        double promedio;
         Scanner input = new Scanner (System.in);//Creamos el scaner
           //Como capturar en java
        System.out.println("Introduce el nombre completo");
        //instruccion de entrada in de salida out 
        nombre = input.nextLine();//nextLine() Camptura texto
         System.out.println("Introduce la edad");
         edad=input.nextInt();
         System.out.println("Introduce el promedio");
         promedio=input.nextDouble();
         
         System.out.println("El nombre capturado es :");
        System.out.println(nombre);
        System.out.println("La edad es :");
        System.out.println(edad);
        System.out.println("El promedio es  :");
        System.out.println(promedio);
        
        
    }
    
}
