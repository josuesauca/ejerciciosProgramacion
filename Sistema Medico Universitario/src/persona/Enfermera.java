package persona;

public class Enfermera extends Empleado{
    public String especialidad;

    public Enfermera(String nombre, int horasDiarias, double salario) {
        super(nombre, horasDiarias, salario);
    }
    
    
    public Enfermera(String nombre, int horasDiarias, double salario,String especialidad) {
        super(nombre, horasDiarias, salario);
        this.especialidad = especialidad;
    }
    
    //@Override
    public double consultarSueldoExtra(int numeroHoras){
        return numeroHoras*9;
        
    }
    
}
