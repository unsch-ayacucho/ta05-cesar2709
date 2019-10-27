package EJERCICIO003;

public class Empleado {
    String codigo;
    String nombre;
    String área_laboral;
    double sueldo;
    int horas_extras;
    double afiliacion_AFP;
    
    public void Datos(){
        System.out.println("CODIGO DEL EMPLEADO: " + codigo);
        System.out.println("NOMBRE DEL EMPLEADO: " + nombre);
        System.out.println("SU AREA LABORAL: " + área_laboral);
    }
    public void Calculo(){
        float D1 = (float) (sueldo*0.11);
        float D2 = (float) (sueldo*0.13);
        float D3 = (float) (sueldo*0.03);
        float Desc_Tot = (D1+D2+D3);
        
        double monto_HorExt = (sueldo/240)*horas_extras;
        System.out.println("EL MONTO POR LAS HORAS EXTRAS ES: " + monto_HorExt);
        System.out.println("EL MONTO DE LOS DESCUENTOS POR APF SON DE: " + D1);
        System.out.println("EL MONTO DE LOS DESCUENTOS POR SNP SON DE: " + D2);
        System.out.println("EL MONTO DE LOS DESCUENTOS POR SALUD SON DE: " + D3);
        System.out.println("EL MONTO TOTAL DE LOS DESCUENTOS ES DE: " + Desc_Tot);
        double Sueldo_Tot = sueldo + monto_HorExt;
        System.out.println("EL SUELDO TOTAL ES DE: " + Sueldo_Tot);
        double Sueldo_Neto = Sueldo_Tot - Desc_Tot;
        System.out.println("EL SUELDO NETO ES DE: " + Sueldo_Neto);
    }
}
