package frutas;
import java.util.Scanner;

public class ManzanaGraniSmith extends Manzanas{
    private int totalBolsas;
    
    public ManzanaGraniSmith(){
    }
    
    public ManzanaGraniSmith(double pesoManzana,int totalBolsas){
        super(pesoManzana);
        this.totalBolsas = totalBolsas;        
    }

    public int getTotalBolsas() {
        return totalBolsas;
    }

    public void setTotalBolsas(int totalBolsas) {
        this.totalBolsas = totalBolsas;
    }
    
    public double calcularCostoVenta(Scanner scanner){
        double costoTotal = 0;
        boolean bandera = false;
        double pesoBolsa = 0;
        int opcionBolsas = 0; 
        String opcion;
        
        do{
            bandera = false;
            
            System.out.print("\nPeso Bolsa : ");
            
            pesoBolsa = scanner.nextDouble();
            
            costoTotal = costoTotal + (pesoBolsa * this.precioKiloManzanas);
            System.out.print("\nDesea ingresar mas bolsas 1(Si)(Enter) o 2(No)(-) : ");
            opcion = scanner.nextLine();
            opcion = scanner.nextLine();
            
            if(opcion.equals("")){
                bandera = true;
            }
            //costoTotal = costoTotal + (pesoBolsa * getPrecioKiloManzanas());
            
        }while(bandera);
        
        return costoTotal;
    }
    
}
