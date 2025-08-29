/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_triangulo;

/**
 *
 * @author nikol
 */
public class Eva1_7_triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Area de un triangulo
        //Area=(base x altura)entre 2;
        double area;
        double base;
        double altura; //tres variables de un tipo double 
        //inicializacion
        base = 11;
        altura = 3;
        // Se aplica precedencia de operaciones 
        area =  (base *altura) /2.0 ;//Cuidado con dividir entre enteros 
        System.out.println("El area de un triangulo base 11 y altura 3 es:");
        System.out.println(area);
       
    }
    
}
