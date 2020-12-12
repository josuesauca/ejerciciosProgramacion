package persona;

public class Medico extends Empleado{    
    
    private String especialidad;

    public Medico(String especialidad) {
        this.especialidad = especialidad;
    }

    public Medico(String nombre, int horasDiarias, String especialidad, double salario) {
        super(nombre, horasDiarias, especialidad, salario);
    }
    
    public Medico(String nombre, double salario,String especialidad) {
        super(nombre, salario);
        this.especialidad = especialidad;
    }  
    
    public void operar(){
        
    }
    
    public void recetar(){
        
    }

    //@Override
    public String toString() {
        return  "Nombre : " + (super.getNombre())+ "\n"
                + "Salario : "+(super.getSalario()) +"\n"+
                "Especialidad : "+this.especialidad;
    }
    
    //@Override
    public double consultarSueldoExtra(int numeroHoras){
        return numeroHoras*4;
    }
    
}
