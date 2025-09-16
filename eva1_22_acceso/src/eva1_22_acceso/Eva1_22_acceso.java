/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_22_acceso;

import java.util.Scanner;

/**
 *
 * @author nikol
 */
public class Eva1_22_acceso {
final static  String Acceso_USU="NIKOL";
       final static String Acceso_Contraseña ="1234";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usuario,contraseña;
        Scanner captu = new Scanner (System.in);
        System.out.println("****Control de acceso***");
        System.out.println("La cucaracha crocante");
        System.out.println("Usuario");
      usuario=captu.nextLine();
       System.out.println("Contraseña:");
    contraseña=captu.nextLine();
    //operador and &&-->(Y)
   if(usuario.equals(Acceso_USU)&&contraseña.equals( Acceso_Contraseña)){
   System.out.println("Acceso concedido");
   }else{
       System.out.println("Acceso denegado");
   }
    
    }
    
}
