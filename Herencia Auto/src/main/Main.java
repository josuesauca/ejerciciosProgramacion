package main;

import medios_transporte.*;

/*

Cada clase debe tener al menos un constructor
El programa debe permitit crear objetos de todas las clases

Que nos permita imprimir cada una de las clases con sus atributos
Vamos a crear objetos de tipo vehiculo ,
enviando los parametro por teclado

*/

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        Motocicleta motocicleta= new Motocicleta();
        Bicicleta bicicleta = new Bicicleta();
        Camioneta camioneta = new Camioneta();
        Coche coche = new Coche();
        
        vehiculo = new Vehiculo("Rojo",4 , 123, "Aveo");
        motocicleta = new Motocicleta("Verde", 4, 4560, "Kia", 50.6D, 250D);
        bicicleta = new Bicicleta("Amarilla", 2, "Supra", "Urbana");
        camioneta = new Camioneta(1000D, 50.6D, 250, "Cafe", 4, 4560, "Toyota");
        coche = new Coche(450, 250,"Morado", 4, 1234, "Mazda");
        
        System.out.println("\nVehiculo");
        vehiculo.imprimirDatos();
        System.out.println("\nFin Vehiculo");
        System.out.println("\nMotocicleta");
        motocicleta.imprimirDatos();
        System.out.println("\nFin Motocicleta");
        System.out.println("\nBicicleta");
        bicicleta.imprimirDatos();
        System.out.println("\nFin Bicicleta");
        System.out.println("\nCamioneta");
        camioneta.imprimirDatos();
        System.out.println("\nFin Camioneta");
        System.out.println("\nCoche");
        coche.imprimirDatos();
        System.out.println("\nFin Coche");
        
        
        
    }
}
