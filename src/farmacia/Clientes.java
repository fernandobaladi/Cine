/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

/**
 *
 * @author Estudiantes
 */
public class Clientes {
    private String nombre, apellido, sexo,dirección;
    private int cédula, telefono;
    private Productos[] Bolsa= new Productos[10]; 

    public Clientes(String nombre, String apellido, String sexo, String dirección, int cédula, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.dirección = dirección;
        this.cédula = cédula;
        this.telefono = telefono;
    }
    
    public void Comprar(){
        
        Alimentos alimento = new Alimentos(00025, 100, "Dorito", 1500);
        Cosmeticos cosmetico = new Cosmeticos(35, 100, "Valmy", 7000);
        medQuimico medicamento = new medQuimico(0001, 1000, "Atamel", 3000);
        
        
        for (int i=0;i<Bolsa.length;i++){
            int numero = (int) (Math.random() * 3) + 1;

            if (numero==1){
                Bolsa[i]=medicamento;
            }

            else if(numero==2){
                Bolsa[i]=alimento;
            }

            else{
            
                Bolsa[i]=cosmetico;
            }

            }
        System.out.println("La bosa tiene: ");
        for(int i=0; i<Bolsa.length;i++){
        
            System.out.println(Bolsa[i].getNombre());
        }
        
            }

}
    
    
    
