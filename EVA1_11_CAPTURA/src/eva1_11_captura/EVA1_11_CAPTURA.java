/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_captura;

import java.util.Scanner;

/**
 *
 * @author aylin
 */
public class EVA1_11_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CALCULO DE VELOCIDAD:
        //SOLICITAR DISTANCIA (M) Y TIEMPO (S)
        //CALCULAR LA VELOCIDAD (M/S)
        //DECLARAR VARIABLES Y SCANNER
        Scanner input = new Scanner (System.in);
        double  dis, vel, tie , velkm;
        
        //SOLICITAR DATOS
        System.out.println("CAPTURA LA DISTANCIA(M)");
        dis = input.nextDouble();
        System.out.println("CAPTURA eltiempo (t)");
        tie = input.nextDouble();
        System.out.println("CAPTURA velocidad (v)");
        vel = input.nextDouble();
        
        //REALIZAR CALCULOS
        vel = dis / tie;
        
        //MOSTRAR RESULTADOS
        System.out.println("LA VELOCIDAD (m/s) es :");
        System.out.println(vel);
        //dar resultados en km/hr
        velkm = vel * 3.6;
        System.out.println("la velocidad en km/hr es:");
        System.out.println(velkm);
    }
    
}
