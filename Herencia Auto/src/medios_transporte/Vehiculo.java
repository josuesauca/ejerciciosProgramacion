package medios_transporte;


public class Vehiculo {
    
    private String color;
    private int ruedas;
    private int placa;
    private String marca;
    
    public Vehiculo(){        
    }

    public Vehiculo(String color, int ruedas, int placa, String marca) {
        this.color = color;
        this.ruedas = ruedas;
        this.placa = placa;
        this.marca = marca;
    }
    
    //Metodo contructo para bicicleta
    
    public Vehiculo(String color,int ruedas,String marca){
        this.color = color;
        this.ruedas = ruedas;
        this.marca = marca;
        
    }

    public String getColor() {
        return this.color;
    }

    public int getRuedas() {
        return this.ruedas;
    }

    public int getPlaca() {
        return this.placa;
    }

    public String getMarca() {
        return this.marca;
    }
  
    public void imprimirDatos(){
        System.out.println("El color del vehiculo es : "+this.color);
        System.out.println("El vehiculo tiene : "+this.ruedas+" ruedas");
        System.out.println("El vehiculo tiene la siguiente placa : "+this.placa);
        System.out.println("El vehiculo tiene es de la marca : "+this.marca);
    }
    
}
