/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

/**
 *
 * @author Estudiantes
 */
public class medNutricionales extends Medicamentos{
    
    public medNutricionales(int código, int existencia, String nombre, float precio) {
        super(código, existencia, nombre, precio,"Nutricional");
    }
    
}
