/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_26_operaciones;

import java.util.Scanner;

/**
 *
 * @author nikol
 */
public class Eva1_26_operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Todo el code application logic here
        //diviciones:
        Scanner captu=new Scanner (System.in);
        int vale1=1, vale2=3;
        int resu;
        resu=vale1/vale2;
        System.out.println("7/3=");
       System.out.println(resu);
        
        double vl1=1, vl2=3;
        double res;
        res= vl1 / vl2;
        System.out.println("7.0/3.0=");
        System.out.println(res);
        
        //calculadora
        //residuo = modulo =5
        int num1=2024,num2=4;
        int resi;
        resi = num1/num2;//calculo de residuo
        System.err.println("Resuiduo de 2024 / 4 = es:");
        System.out.println(resi);
        if(resi==0){//divicion exacta entre 4 
        System.err.println("Puede que sea bisiesto");
        }
    }
    
}
