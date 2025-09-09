/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author nikol
 */
public class Eva1_16_numero_mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pos_uno,pos_dos;
        Scanner captu =new Scanner (System.in);
        System.out.println("Primer numero es:");
        pos_uno=captu.nextInt();
         System.out.println("El segundo numero es:");
        pos_dos=captu.nextInt();
        if(pos_uno>pos_dos){
            System.out.println("El numero es mayor es??"+pos_uno);
        }else{
             System.out.println("El numero es mayor es??"+pos_dos);
            
    }
    
}
}