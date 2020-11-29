package main;

import java.util.Scanner;

public class validarCedula {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese su cedula : ");
        
        String cedula = scanner.next();
        
        int cedulaTransformada[] = transformarStringEnArreglo(cedula);
                
        String primerSegundoNumeroCedula = String.valueOf(cedulaTransformada[0]) + String.valueOf(cedulaTransformada[1]);
        
        int codigoProvincia = Integer.valueOf(primerSegundoNumeroCedula);
        
        int arregloCopia[] = copiarCedula(cedulaTransformada);
        
        arregloCopia = multiplicarPares(arregloCopia);
        
        for (int i = 0; i < arregloCopia.length-1; i++) {
            if(arregloCopia[i] > 9){
                arregloCopia[i] -=9;
            }
        }
        
        int sumaArreglo = sumaArray(arregloCopia);

        int moduloSumaArreglo = sumaArreglo%10;
        
        int nuevaSuma = 10 - moduloSumaArreglo;
        
        int sumaArregloFalta = nuevaSuma + sumaArreglo;
        
        int ultimoNumero = sumaArregloFalta - sumaArreglo;
               
        imprimirCedula(arregloCopia);
        
        validarCedula(cedulaTransformada,ultimoNumero,codigoProvincia);
        
        
        
        
    /////////////////////////////////////////////////////////////////////

//    int cedulaNueva = 1105580581;
//    int arreglo[] ={1,0,0,5,7,13,14,245,6};
//    
//    for (int i = 0; i < 10; i++) {
//        int n = arreglo[i];
//        int modulo = n%2;
//        
//        if(modulo%0==0){
//            System.out.println("Es par");
//        }else{
//            System.out.println("Es impar");
//        }
//
//        int residuo = n%10;
//        int loquefalta = 10-residuo;
//
//        System.out.println("La siguiente decena es lo que le falta : "+(n+loquefalta));
//        
//    }
//        
//        
//        
        
    }
    
    public static int[] transformarStringEnArreglo(String cedula){
        int cedulaTransformada[] = new int[10];
        
        for (int i = 0; i < 10; i++) {            
            cedulaTransformada[i] = Character.getNumericValue(cedula.charAt(i));            
        }
        return cedulaTransformada;
    }
    
    public static void imprimirCedula(int arreglo[]){
        for (int i = 0; i < 10; i++) {
            System.out.print(arreglo[i]+" ");   
        }
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
    
    public static int[] multiplicarPares(int cedulaCopia[]){
        
        for (int i = 0; i < cedulaCopia.length-1; i++) {
            if(i%2==0){
                cedulaCopia[i] *=2;                
            }
        }
        return cedulaCopia;
    }
    
    public static void validarCedula(int cedula[],int ultimoNumero, int codigoPrivincia){
        
        if((cedula[9] == ultimoNumero) && (codigoPrivincia == 30)){
            System.out.println("\nSu cedula es valida y pertenece a un ciudadano extranjero");
            
        }else{
            if((cedula[9] == ultimoNumero) && (codigoPrivincia < 25)){
                System.out.println("\nSu cedula es valida");
            }else{
                System.out.println("\nSu cedula no es valida");
            }            
        }
        
       
    }
}
