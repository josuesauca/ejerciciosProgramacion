package medios_transporte;

public class Vehiculo {
    
    private String color;
    private int ruedas;
    private String placa;
    private String modeloVehiculo;
    
    public Vehiculo(){
    }

    public Vehiculo(String color, int ruedas, String placa, String modeloVehiculo) {
        this.color = color;
        this.ruedas = ruedas;
        this.placa = placa;
        this.modeloVehiculo = modeloVehiculo;
    }

    public Vehiculo(String color, int ruedas, String modeloVehiculo) {
        this.color = color;
        this.ruedas = ruedas;
        this.modeloVehiculo = modeloVehiculo;
    }
   
    public String getColor() {
        return this.color;
    }

    public int getRuedas() {
        return this.ruedas;
    }

    public String getPlaca() {
        return this.placa;
    }

    public String getModeloVehiculo() {
        return this.modeloVehiculo;
    }
    
    public void mostrarDatos(){  
    }
}
