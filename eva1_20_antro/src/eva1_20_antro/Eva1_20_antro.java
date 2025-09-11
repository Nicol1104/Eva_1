/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_antro;

import java.util.Scanner;

/**
 *
 * @author nikol
 */
public class Eva1_20_antro {
final static String ACCESO_EDAD="si";
final static String ACCESO_CREDENCIAL="si";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String edad,credencial;
        Scanner captu=  new Scanner (System.in);
                System.out.println("Antro!!!");
        System.out.println("Eres mayor de edad?");
        edad =captu.nextLine();
       System.out.println("Tiene credencial?");
       credencial=captu.nextLine();
       if(edad.equals(ACCESO_EDAD)){
           if(credencial.equals(ACCESO_CREDENCIAL)){
               System.out.println("Es mayor de edad puede pasar ");
           }else{
               System.out.println("No puedes pasar ");
           }
       }else{
       System.out.println("Es menor de edad!!!");
       }
       }
       }
       


