    
    import  java.util.Scanner;
    /**
     *
     * @author Sammy Guergachi <sguergachi at gmail.com>
     */
    public class CorreccionDeLaPrueba {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {

            // TODO code application logic here
            Scanner entrada = new Scanner(System.in);
            String _Matriz[][] = new String[1][1];
            int n = 0;
            int suma=0;
            boolean bandera = false;
            
            System.out.print("\t\tPrueba de Unidad 1\n");
            System.out.print("\tFechas:02 de diciembre de 2020\n");
            System.out.print("\tIntegrantes:\n-Edy Jimenez\n");
            System.out.println("===================================================================================");
            System.out.println("Por favor escoger primeramente la opcion 1 para poder almacenar los datos");
            System.out.println("===================================================================================");           

            boolean salir = false;

            while (!salir) {
                System.out.println("\n\n\nMENU");
                System.out.println("1. Cargar los elementos de una matriz de una matriz");
                System.out.println("2. Obtener la suma total de los elementos en  cada pocision de la matriz excepto en su diagonal principal");
                System.out.println("3. Obtener si la cedula ingresada es válida en su diagonal principal");
                System.out.println("4. Salir ");

                System.out.println("---Escribe una de las opciones---");
                int opcion;
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1: 
                        boolean ban = false;
                        int longitud = 0;
                        System.out.println("===================================================================================");   
                        System.out.println("Ingrese el tamaño de la matriz");
                        n = entrada.nextInt();
                        _Matriz = new String[n][n];
                        System.out.println("IIngresar datos de la matriz:");

                        // Cargar y presentar la matriz M
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < n; j++) {

                                do{

                                    ban = false;
                                    _Matriz[i][j] = entrada.next();

                                    longitud = _Matriz[i][j].length();
                                    if(longitud > 10){
                                        System.out.println("Digitos de rango, intente de nuevo !!!");
                                        ban = true;
                                    }

                                    if(longitud < 10){
                                        System.out.println("Digitos de rango, intente de nuevo !!!");
                                        ban = true;
                                    }

                                }while(ban);

                            }
                        }

                        System.out.println("Presentar la matriz");
                        System.out.println("===================================================================================");

                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < n; j++) {
                                // System.out.print("Matriz ["+i+"]["+j+"] = "+Matriz[i][j]);//
                                System.out.print(_Matriz[i][j] + "\t");
                            }
                            System.out.println();
                        }

                        System.out.println("===================================================================================");
                        break;

                    case 2:
                        System.out.println("Suma de los digitos de las cedulas que no esten en la diagonal principal ");
                        System.out.println("===================================================================================");
                        int sumaMain = 0;
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < n; j++) {
                               
                               if(j != i){
                                    sumaMain = sumaCedulaa(_Matriz[i][j]);
                                    System.out.print(sumaMain+"\t");
                               }
                                   

                                if(i == j){
                                    bandera = verificarCI(_Matriz[i][j]);
                                        if(bandera){    // bamdera == true
                                            System.out.print("Cedula Verificada\t");   
                                        }else{
                                            System.out.print("Cedula NO Verificada\t");   
                                        }
                                }

                                
                            }
                            System.out.println();
                        }

                        break;
                            
                    case 3:
                        System.out.println("===================================================================================");
                        System.out.println("---GRACIAS POR USAR NUESTRO PROGRAMA---");
                        salir = true;
                        break;

                    default: System.out.println("No hay mas opciones :( ");   
                }
            }
        }


        public static int sumaCedulaa(String cedula){
            int suma = 0;
            int conversion = 0;
            for(int i = 0; i < cedula.length(); i-=-1){
                conversion = Integer.parseInt(cedula.charAt(i) +"");
                //conversion = conversion.charAt();
                suma = suma + conversion;
            }

            return suma;
        }

        public static boolean verificarCI(String cedula){
            boolean verificar = false;
            int conversion = 0;
            int suma = 0;
            String primerDig = "";
            String segundoDig = "";
            String codProvincia = "";
            int ultimoDig = 0;

            for(int i = 0; i < cedula.length() - 1; i-=-1){
                conversion = Integer.parseInt(cedula.charAt(i) +"");

                // codProvincia = (Integer.parseInt(cedula.charAt(0) +"")) + (Integer.parseInt(cedula.charAt(1) +""));

                if(i % 2 == 0){
                    conversion = conversion * 2; 
                    if(conversion > 9){
                        conversion = conversion - 9;
                    }
                }
                suma = suma + conversion;
            }

            int codigo = Integer.valueOf(codProvincia);

            for(int i = 0; i < cedula.length(); i++){
                if (i == 9){
                    ultimoDig = Integer.parseInt(cedula.charAt(i) +"");
                }
            }

            int acumulador = 0, resta = 0; 
            if(suma % 10 != 0){
                acumulador = ((suma / 10) + 1) * 10;
                resta = acumulador - suma;

            }

            if(ultimoDig ==  resta8/* && codigo > 24*/){
                verificar = true;
            }else{
                verificar = false;
            }

            
            return verificar;
        }
    }
