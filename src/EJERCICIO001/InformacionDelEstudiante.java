package EJERCICIO001;


import EJERCICIO001.Estudiante;


public class InformacionDelEstudiante {
    public static void main(String[] args) {
        
        Estudiante est = new Estudiante("27182109","Ing. Sistemas",10,10,10,03);  
        est.MostrarDatos();
        est.Promedio();
    }
}
