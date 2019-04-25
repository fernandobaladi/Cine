/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

/**
 *
 * @author Estudiantes
 */
public class Farmacia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        medQuimico atamel = new medQuimico(0001, 1000, "Atamel", 3000);
        System.out.println("El precio del atamel es: "+atamel.getPrecio());
        System.out.println("El componente es:"+atamel.getComponente());
        
        Clientes c1 = new Clientes("Antonio",  "Guerra", "M", "San Antonio",  24464173, 989733);
        c1.Comprar();
    }
    
}
