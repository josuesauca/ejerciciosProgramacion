package medios_transporte;

public class Motocicleta extends Bicicleta{
    private  double velocidad;
    private double cilindrada;
    public Motocicleta(){
    }
    
    public Motocicleta(String tipo_urbana_deportiva, String color, int ruedas, String placa, String modeloVehiculo, double velocidad,double cilindrada){
        super(tipo_urbana_deportiva, color, ruedas, placa, modeloVehiculo);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }
    
    @Override
    public void mostrarDatos(){
        System.out.println("El color de la motocicleta es : "+super.getColor());
        System.out.println("La motocicleta tiene : "+super.getRuedas()+" ruedas");
        System.out.println("La motocicleta tiene la siguiente placa : "+super.getPlaca());
        System.out.println("La motocicleta es de la marca : "+super.getModeloVehiculo());
        System.out.println("La motocicleta es de tipo : "+super.getTipo_urbana_deportiva());
        System.out.println("La velocidad maxima de la motocicleta es : "+this.velocidad);
        System.out.println("La cilindrada de la motocicleta es : "+this.cilindrada);  
    }
}
