package medios_transporte;

public class Coche extends Vehiculo{
    
    private double velocidad;
    private double cilindrada;
    
    public Coche(){
    }

    public Coche(double velocidad, double cilindrada, String color, int ruedas, int placa, String marca) {
        super(color, ruedas, placa, marca);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    public double getVelocidad() {
        return this.velocidad;
    }

    public double getCilindrada() {
        return this.cilindrada;
    }
    
    @Override
    public void imprimirDatos(){
        System.out.println("El color del coche es : "+super.getColor());
        System.out.println("El coche tiene : "+super.getRuedas()+" ruedas");
        System.out.println("El coche tiene la siguiente placa : "+super.getPlaca());
        System.out.println("El coche tiene es de la marca : "+super.getMarca());
        System.out.println("La velocidad maxima del coche es : "+this.velocidad);
        System.out.println("La cilindrada del coche es : "+this.cilindrada);
    }
    
    
    
}
