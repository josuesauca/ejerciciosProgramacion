package medios_transporte;

public class Coche extends Vehiculo{
    private double velocidad;
    private double cilindrada;
    
    public Coche(){
    }

    public Coche(double velocidad, double cilindrada, String color, int ruedas, String placa, String modeloVehiculo) {
        super(color, ruedas, placa, modeloVehiculo);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public double getCilindrada() {
        return cilindrada;
    }
    
    
    
    //@Override
    public void mostrarDatos(){
        System.out.println("El color del coche es : "+super.getColor());
        System.out.println("El coche tiene : "+super.getRuedas()+" ruedas");
        System.out.println("El coche tiene la siguiente placa : "+super.getPlaca());
        System.out.println("El coche tiene es de la marca : "+super.getModeloVehiculo());
        System.out.println("La velocidad maxima del coche es : "+this.velocidad);
        System.out.println("La cilindrada del coche es : "+this.cilindrada);
    }
    
}
