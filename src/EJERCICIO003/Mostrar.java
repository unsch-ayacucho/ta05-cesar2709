/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIO003;

/**
 *
 * @author USUARIO
 */
public class Mostrar {
    public static void main(String[] args) {
        Empleado e = new Empleado();
        e.codigo= "27182109";
        e.nombre = "Cesar";
        e.área_laboral="Desarrollador de software";
        e.sueldo=1500;
        e.horas_extras=12;
        
        e.Calculo();
    }
}
