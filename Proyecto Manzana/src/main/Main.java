package main;

import frutas.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Manzanas manzana = new Manzanas();
        ManzanaGraniSmith manzana_grani_smith = new ManzanaGraniSmith();
        Scanner scanner = new Scanner(System.in);
        int opcionMenu = 1;
        double pesoManzana = 0;
        double costoVenta = 0;
        
        try{
            while(opcionMenu > 0 && opcionMenu <3){
                menuOpcion();
                opcionMenu = scanner.nextInt();

                switch (opcionMenu) {
                    case 1:
                        System.out.print("Ingrese el Kilo de Manzanas : ");
                        pesoManzana = scanner.nextDouble();

                        manzana = new Manzanas(pesoManzana);

                        System.out.println("Tus vergas de manzanas valen : " + manzana.calcularCostoVenta());
                        break;
                        
                    case 2:
                        costoVenta = manzana_grani_smith.calcularCostoVenta(scanner);
                        System.out.println("Tus vergas de manzanas valen : "+costoVenta);
                        break;
                }
            }
        }catch(Exception ex){
            System.out.println("Su ejecucion fallo");
            System.out.println(ex.getMessage());
        }
        
    }
    
    public static void menuOpcion(){
        System.out.println("\n\n***********Menu Opciones***********");   
        System.out.println("1. Manzanas BlancaNieves");   
        System.out.println("2. Manzanas con Ingredientes Secretos");   
        System.out.println("Opcion : ");
    }
}
