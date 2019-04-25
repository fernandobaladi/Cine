/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

/**
 *
 * @author Estudiantes
 */
public class Medicamentos extends Productos {
    private String Componente;
            
    public Medicamentos(int código, int existencia, String nombre, float precio, String Componente) {
        super(código, existencia, nombre, precio);
        this.Componente=Componente;
    }

    public String getComponente() {
        return Componente;
    }

    public void setComponente(String Componente) {
        this.Componente = Componente;
    }

    
    
}
