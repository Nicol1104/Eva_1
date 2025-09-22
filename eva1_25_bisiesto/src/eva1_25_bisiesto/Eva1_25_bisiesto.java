/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_25_bisiesto;

import java.util.Scanner;

/**
 *
 * @author nikol
 */
public class Eva1_25_bisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1=1900,num2=4;
        int resi = num1 % num2;
        System.out.println("Primer prueba de año bisiesto:");
         System.out.println("Residuo de 2024 % 4 ");
          System.out.println(resi);
          if(resi == 0){
           System.out.println("puede que sea  bisiesto");
          }
        
        Scanner captu=new Scanner(System.in);
        int year;
        int resi4,resi100,resi400;
         System.out.println("Captura el  año");
         year=captu.nextInt();
         resi4=year %4;
          resi100=year %100;
           resi400=year %400;
       if (resi4==0){
        if(resi100==0){//Divicible entre 100(No es bisiesto)
        if (resi400==0){//Excepto si es divicible entre 400(Es bisiesto)
        System.out.println("El aoño"+year+"Es bisiesto");
        }else{
            System.out.println("El año"+year+"No es bisiesto");
        }
        }else{
            System.out.println("El año"+year+"Es bisiesto");
        }
       }else{
           System.out.println("El año"+year+"No es bisiesto");
       }
    }
    
}
