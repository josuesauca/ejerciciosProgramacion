package main;

import medios_transporte.*;

public class Main {
    public static void main(String[] args) {
        
        Bicicleta bicicleta = new Bicicleta();
        Camioneta camioneta = new Camioneta();
        Coche coche = new Coche();
        Motocicleta motocicleta = new Motocicleta();
        
        bicicleta = new Bicicleta("Rojo", 4, "Montañera", "Rural");
        camioneta = new Camioneta(1000D, 220, 220, "Cafe",5 ,"ABC" , "TOYOTA");
        coche = new Coche(220, 220, "Verde", 4, "HDR", "MAZDA");
        motocicleta = new Motocicleta("Urbanda", "Amarillo", 2, "JDK", "KIA", 220, 220);
        
        System.out.println("\nBicicleta");
        bicicleta.mostrarDatos();
        System.out.println("\nFin Bicicleta");
        System.out.println("\nCamioneta");
        camioneta.mostrarDatos();
        System.out.println("\nFin Camioneta");
        System.out.println("\nCoche");
        coche.mostrarDatos();
        System.out.println("\nFin Coche");
        System.out.println("\nMotocicleta");
        motocicleta.mostrarDatos();
        System.out.println("\nFin Motocicleta");
      
    }
}
