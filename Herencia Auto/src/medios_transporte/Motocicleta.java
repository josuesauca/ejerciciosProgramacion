package medios_transporte;

public class Motocicleta extends Bicicleta{
    private double velocidad;
    private double cilindrada;
    
    public Motocicleta(){
        
    }
    
    public Motocicleta(String color, int ruedas, int placa, String marca,double velocidad,double cilindrada){
        super(color, ruedas, placa, marca);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }
    
    @Override
    public void imprimirDatos(){
        System.out.println("El color de la motocicleta es : "+super.getColor());
        System.out.println("La motocicleta tiene : "+super.getRuedas()+" ruedas");
        System.out.println("La motocicleta tiene la siguiente placa : "+super.getPlaca());
        System.out.println("La motocicleta es de la marca : "+super.getMarca());
        System.out.println("La velocidad maxima de la motocicleta es : "+this.velocidad);
        System.out.println("La cilindrada de la motocicleta es : "+this.cilindrada);
    }
    
}
