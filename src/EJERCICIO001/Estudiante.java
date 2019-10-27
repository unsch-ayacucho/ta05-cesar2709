package EJERCICIO001;

public class Estudiante {
    private String codigo;
    private String especialidad;
    private int nota01,nota02,nota03,nota04;
    Estudiante(String codigo, String especialidad,int nota01,int nota02,int nota03,int nota04){
        this.codigo = codigo;
        this.especialidad = especialidad;
        this.nota01 = nota01;
        this.nota02 = nota02;
        this.nota03 = nota03;
        this.nota04 = nota04;
    }
    public void MostrarDatos(){
        System.out.println("CODIGO DEL ESTUDIANTE:" + codigo);
        System.out.println("ESPECIALIDAD DEL ESTUDIANTE:" + especialidad);
    }
    public void Promedio(){
        int promedio;
        int menor =nota01;
        if(nota02<menor){
            menor = nota02;}
        if(nota03<menor){
            menor = nota03;}
        if(nota04<menor){
            menor = nota04;}
        promedio = (nota01+nota02+nota03+nota04-menor)/3;
        System.out.println("EL PROMEDIO DE DICHAS NOTAS ES: " + promedio);
    }
}