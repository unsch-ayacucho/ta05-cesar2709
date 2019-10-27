
package EJERCICIO002;


public class Ventana {
    String nombre;
    boolean abrir;
    boolean cerrar;
    boolean maximizar;
    boolean minimizar;
    boolean guardar;
    
    
    public void Abrir(){
        
        System.out.println("Desea abrir la ventana: " + abrir);
    } 
    public void Cerrar(){
           
        System.out.println("Desea cerrar la ventana: " + cerrar);
    }
    
    public void Max(){
        
        System.out.println("Desea maximizar la ventana: " + maximizar);
    }    
    public void Min(){
        
        System.out.println("Desea minizar la ventana: " + minimizar);
    }
    public void Guardar(){
        
        System.out.println("Desea guardar la ventana: " + guardar);
    }
    
    public void Nombre(){
        System.out.println("NOMBRE DE LA VENTA ES: " + nombre);
    }
    
}
    

