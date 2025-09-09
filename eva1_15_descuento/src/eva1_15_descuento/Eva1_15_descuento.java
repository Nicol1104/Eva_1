/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_descuento;

import java.util.Scanner;

/**
 *
 * @author nikol
 */
public class Eva1_15_descuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double venta,descuento;
        Scanner captu = new Scanner(System.in);
        System.out.println("Tu venta fue de:");
        venta=captu.nextDouble();
        if(venta>1000){//se le da descuento
             descuento=venta*0.85;
        System.out.println("Se le hara descuento");
            System.out.println(descuento);
       
    }
    
}
}