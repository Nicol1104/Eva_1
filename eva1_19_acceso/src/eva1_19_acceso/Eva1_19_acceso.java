/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_acceso;

import java.util.Scanner;

/**
 *
 * @author nikol
 */
public class Eva1_19_acceso {
final static  String Acceso_USU="NIKOL";
       final static String Acceso_Contraseña ="1234";
       //final static double pi=3.1416;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // TODO code application logic here
        String usuario,contraseña;
        Scanner captu = new Scanner (System.in);
        System.out.println("****Control de acceso***");
        System.out.println("La cucaracha crocante");
        System.out.println("Usuario");
      usuario=captu.nextLine();
       System.out.println("Contraseña:");
    contraseña=captu.nextLine();
    if (usuario.equals(Acceso_USU)){
        if(contraseña.equals(Acceso_Contraseña)){
        System.out.println("Accesos correcto");
    }else{
        System.out.println("Acceso denegado");
        }
        
    }else{
         System.out.println("Incorrecto");
    }
    
}
}