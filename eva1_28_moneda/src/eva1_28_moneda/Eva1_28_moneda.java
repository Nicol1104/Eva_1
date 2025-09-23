/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_28_moneda;

import java.util.Scanner;

/**
 *
 * @author nikol
 */
public class Eva1_28_moneda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
        int usuario;
       //System.out.println("Elege agulia o sello (1/0");
        //usuario=captu.nextInt();
        //como lanzamos una moneda ??
          if(Math.random()<0.5)
              System.out.println( "agulia has ganado" );
          else
              System.out.println(" sello has perdido ");
        
        
        
        
        
    }
    
}
