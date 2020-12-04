/*

Programa Realizado por : Josue Sauca
						Ricardo Castro"
Segundo Ciclo Paralelo 'B'
Fecha : 19/11/2020

*/
package main;

import java.util.Scanner;

public class validarCedula {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        char repetirPrograma;
        int cedulaTransformada[];
        int validacionIndice = 0;
        try{
            do{

                System.out.print("\n\nIngrese su cedula : ");
                String cedula = scanner.next();

                cedulaTransformada = transformarStringEnArreglo(cedula);
                String codigoProvinciaString = String.valueOf(cedulaTransformada[0]) + String.valueOf(cedulaTransformada[1]);

                int codigoProvincia = Integer.valueOf(codigoProvinciaString);
                int arregloCopia[] = copiarCedula(cedulaTransformada);

                arregloCopia = multiplicarPares(arregloCopia);            
                arregloCopia = validarIndice(arregloCopia);

                int sumaArreglo = sumaArray(arregloCopia);
                
                if(sumaArreglo%10==0){
                    int sacarDecenaSuperior = ((sumaArreglo%10)) + sumaArreglo;
                    validacionIndice = sacarDecenaSuperior - sumaArreglo;
                }else{                    
                    int sacarDecenaSuperior = (10 - (sumaArreglo%10)) + sumaArreglo;
                    validacionIndice = sacarDecenaSuperior - sumaArreglo;
                }
                
                validarCedula(cedulaTransformada,validacionIndice,codigoProvincia);

                System.out.print("\n\nPulse (C) para cancelar el programa,pulse cualquier otra letra para seguir : ");
                repetirPrograma = scanner.next().charAt(0);

            }while(repetirPrograma != 'c'&& repetirPrograma != 'C');

            mensajeFinal();
        }catch(Exception ex){
            System.out.println("\nLa cedula ingresada no tiene los 10 digitos");
            mensajeFinal();
        }
    }
    
    public static int[] transformarStringEnArreglo(String cedula){
        int cedulaTransformada[] = new int[10];
        
        for (int i = 0; i < 10; i++) {            
            cedulaTransformada[i] = Character.getNumericValue(cedula.charAt(i));   
        }
        return cedulaTransformada;
    }
    
    public static int sumaArray(int array[]){
        int sumaArreglo = 0;
        for (int i = 0; i < array.length-1; i++) {
            sumaArreglo = sumaArreglo + array[i];
        }
        
        return sumaArreglo;        
    }
    
    public static int[] copiarCedula(int cedula[]){
        int cedulaCopia[] = new int [10];
        
        for (int i = 0; i < cedula.length; ++i) {
            cedulaCopia[i] = cedula[i];          
        }
        return cedulaCopia;
    }
    
    public static int[] validarIndice(int cedula[]){
        for (int i = 0; i < cedula.length-1; i++) {
            if(cedula[i] > 9){
                cedula[i] -=9;
            }
        }
        return cedula;
    }
    
    public static int[] multiplicarPares(int cedulaCopia[]){
        
        for (int i = 0; i < cedulaCopia.length-1; i++) {
            if(i%2==0){
                cedulaCopia[i] *=2;                
            }
        }
        return cedulaCopia;
    }
    
    public static void validarCedula(int cedula[],int validacionIndice, int codigoPrivincia){
        
        if((cedula[9] == validacionIndice) && (codigoPrivincia == 30)){
            System.out.println("\nSu cedula es valida y pertenece a un ciudadano extranjero");
            
        }else{
            if((cedula[9] == validacionIndice) && (codigoPrivincia < 25 && codigoPrivincia > 0)){
                System.out.println("\nSu cedula es valida");
            }else{
                System.out.println("\nSu cedula no es valida");
            }            
        }
      
    }
    
    public static void mensajeFinal(){
	System.out.println("\nGracias Por Usar el Programa!!!");
	System.out.println("Programa Realizado por : Josue Sauca");
	System.out.println("                         Ricardo Castro");
	System.out.println("Segundo Ciclo Paralelo 'B' ");
	System.out.println("Vuelva Pronto!!!");
    }
}
