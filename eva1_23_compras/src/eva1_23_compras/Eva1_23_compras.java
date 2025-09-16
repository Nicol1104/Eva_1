/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_23_compras;

import java.util.Scanner;

/**
 *
 * @author nikol
 */
public class Eva1_23_compras {
final static String ACCESO_CREDITO="Si";
final static String ACCESO_EFECTIVO="Si";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu =new Scanner(System.in);
        String credito,efectivo;
        System.out.println("Tienes credito?");
        credito =captu.nextLine();
        System.out.println("Tienes efectivo??");
        efectivo =captu.nextLine();
        if(credito.equals(ACCESO_CREDITO)|| efectivo.equals(ACCESO_EFECTIVO)){
        System.out.println("Puedes comprar!!");
        }else{
            System.out.println("No Puedes comprar");
        }
    }
    
}
