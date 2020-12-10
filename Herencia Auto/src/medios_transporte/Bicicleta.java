package medios_transporte;

public class Bicicleta extends Vehiculo{
    
    private String tipo_urbana_deportiva;
    
    public Bicicleta(){
    }
    
    public Bicicleta(String color, int ruedas, String marca,String tipo_urbana_deportiva){
        super(color, ruedas, marca);
        this.tipo_urbana_deportiva = tipo_urbana_deportiva;   
    }
    
    public Bicicleta(String color, int ruedas, int placa, String marca){
        super(color, ruedas, placa, marca);
    }
    
    @Override
    public void imprimirDatos(){
        System.out.println("El color de la bicicleta es : "+super.getColor());
        System.out.println("La bicicleta tiene : "+super.getRuedas()+" ruedas");
        System.out.println("La bicicleta es de la marca : "+super.getMarca());
        System.out.println("La bicicleta es de tipo : "+this.tipo_urbana_deportiva);
    }
    
    
    
}
