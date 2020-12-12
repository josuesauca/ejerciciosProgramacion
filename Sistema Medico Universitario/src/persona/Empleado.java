package persona;
import java.util.GregorianCalendar;

public class Empleado {
    private String nombre;
    private int horasDiarias;
    private GregorianCalendar fechaIngreso;
    private double salario;
    private String especialidad;
    
    public Empleado(String nombre,int horasDiarias,double salario){
        this.nombre = nombre;
        this.horasDiarias =horasDiarias;
        this.salario = salario;
    }

    public Empleado(String nombre,int horasDiarias,String especialidad,double salario){
        this.nombre = nombre;
        this.horasDiarias =horasDiarias;
        this.salario = salario;
        this.especialidad = especialidad;
        
    }
    
    public Empleado(String nombre, int horasDiarias, GregorianCalendar fechaIngreso, double salario) {
        this.nombre = nombre;
        this.horasDiarias = horasDiarias;
        this.fechaIngreso = fechaIngreso;
        this.salario = salario;
    }

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public int getHorasDiarias() {
        return this.horasDiarias;
    }
    
    public GregorianCalendar getFechaIngreso() {
        return this.fechaIngreso;
    }

    public void setFechaIngreso(GregorianCalendar fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHorasDiarias(int horasDiarias) {
        this.horasDiarias = horasDiarias;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSalario() {
        return this.salario;
    }

    public double consultarSueldo(){
        System.out.println("Su sueldo basico es : "+this.salario);
        return this.salario;
    }
//    
//    public double consultarSueldoExtra(int numeroHoras){
//        System.out.println("Su sueldo extra es : "+numeroHoras * 10.00D);
//        return (numeroHoras * 10.00D);
//    }
//    
//     public double consultarSueldoExtraConductor(int numeroHoras){
//        System.out.println("Su sueldo extra es : "+numeroHoras * 10.00D);
//        return (numeroHoras * 10.00D);
//        
//    }
//     
//     public double consultarSueldoExtraMedico(int numeroHoras){
//        System.out.println("Su sueldo extra es : "+numeroHoras * 10.00D);
//        return (numeroHoras * 10.00D);
//        
//    }
    
    //public abstract double consultarSueldoExtra(int numeroHoras)throws AbstractMethodError;
}
