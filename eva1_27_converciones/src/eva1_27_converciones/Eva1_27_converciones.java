/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_27_converciones;

/**
 *
 * @author nikol
 */
public class Eva1_27_converciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int temp;
        double tempdec=25.7;
        temp=(int)tempdec;//conviertelo a entero ->int=casting
        System.out.println(temp);
        
        double tempdec2;
        tempdec2=temp;
        System.out.println(tempdec2);
        
        String  cade, mensaje;
        cade="La temperatura es:";
        mensaje=cade + temp;//la entiende como concatenacion en ves de suma osea cadena los une 
        System.out.println(mensaje);
        
    }
    
}
