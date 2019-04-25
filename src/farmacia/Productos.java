/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

/**
 *
 * @author Estudiantes
 */
public abstract class Productos {
    protected int código,existencia;
    protected String nombre;
    protected float precio;

    public Productos(int código, int existencia, String nombre, float precio) {
        this.código = código;
        this.existencia = existencia;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCódigo() {
        return código;
    }

    public int getExistencia() {
        return existencia;
    }

    public float getPrecio() {
        return precio;
    }

    public void setCódigo(int código) {
        this.código = código;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }


    
   
}
