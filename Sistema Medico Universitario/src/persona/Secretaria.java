package persona;

public class Secretaria extends Empleado{
    
    public Secretaria(String nombre,int horasDiarias,double salario){
        super(nombre,horasDiarias,salario);
    }
    
    public void facturar(String nombreCliente , double valorFacturar){
        System.out.println("Generando Factura");
        double valorIva = valorFacturar*0.12;
        double montoTotal = valorFacturar + valorIva;
        System.out.println("Al cliente : "+nombreCliente+" se debe facturar el monto de : "+montoTotal);
        
    }
    
    public double consultarSueldoExtra(int numeroHoras){
        return numeroHoras*5;
    }
}
