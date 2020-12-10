package frutas;

public class Manzanas {
    private double pesoManzana;
    protected final double precioKiloManzanas = 15;
    //private final double precioKiloManzanas = 15;

    public Manzanas() {
    }
    
    public Manzanas(double pesoManzana){
        this.pesoManzana = pesoManzana;
    }

    public double getPesoManzana() {
        return this.pesoManzana;
    }

    public void setPesoManzana(double pesoManzana) {
        this.pesoManzana = pesoManzana;
    }
    
    public double getPrecioKiloManzanas(){
        return this.precioKiloManzanas;
    }
    
    public double calcularCostoVenta(){
        double costoTotal = this.pesoManzana * precioKiloManzanas;        
        return costoTotal;
    }
       
}
