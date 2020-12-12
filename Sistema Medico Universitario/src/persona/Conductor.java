package persona;
import java.util.GregorianCalendar;

public class Conductor extends Empleado{
    private String licencia;
    
    public Conductor(String nombre,int horasDiarias,double salario,String licencia){
        super(nombre, horasDiarias, salario);
        this.licencia = licencia;
    }
    
    public Conductor(String nombre, int horasDiarias, GregorianCalendar fechaIngreso, double salario){
        super(nombre, horasDiarias, fechaIngreso, salario);
    }
    
    
    //@Override
    public double consultarSueldoExtra(int numeroHoras){
        return  numeroHoras*3;
    }
}
