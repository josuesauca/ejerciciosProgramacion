package medios_transporte;

public class Camioneta extends Coche{
    
    private double carga;
    
    public Camioneta(){
    }

    public Camioneta(double carga, double velocidad, double cilindrada, String color, int ruedas, int placa, String marca) {
        super(velocidad, cilindrada, color, ruedas, placa, marca);
        this.carga = carga;
    }

    @Override
    public void imprimirDatos(){
        System.out.println("El color de la camioneta es : "+super.getColor());
        System.out.println("La camioneta tiene : "+super.getRuedas()+" ruedas");
        System.out.println("La camioneta tiene la siguiente placa : "+super.getPlaca());
        System.out.println("La camioneta es de la marca : "+super.getMarca());
        System.out.println("La velocidad maxima de la camioneta es : "+super.getVelocidad());
        System.out.println("La cilindrada de la camioneta es : "+super.getCilindrada());
        System.out.println("La carga maxima de la camioneta es : "+this.carga);
    }
}
