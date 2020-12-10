package medios_transporte;

public class Bicicleta extends Vehiculo{
    private String tipo_urbana_deportiva;
    
    public Bicicleta(){
    }
    
    public Bicicleta(String color, int ruedas, String modeloVehiculo,String tipo_urbana_deportiva){
        super(color, ruedas, modeloVehiculo);
        this.tipo_urbana_deportiva = tipo_urbana_deportiva;
    }

    public Bicicleta(String tipo_urbana_deportiva, String color, int ruedas, String placa, String modeloVehiculo) {
        super(color, ruedas, placa, modeloVehiculo);
        this.tipo_urbana_deportiva = tipo_urbana_deportiva;
    }

    public String getTipo_urbana_deportiva() {
        return tipo_urbana_deportiva;
    }
   
    //@Override
    public void mostrarDatos(){
        System.out.println("El color de la bicicleta es : "+super.getColor());
        System.out.println("La bicicleta tiene : "+super.getRuedas()+" ruedas");
        System.out.println("La bicicleta es de la marca : "+super.getModeloVehiculo());
        System.out.println("La bicicleta es de tipo : "+this.tipo_urbana_deportiva);
    }
}
