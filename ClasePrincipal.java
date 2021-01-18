/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_de_vuelos;

/**
 *
 * @author ASUS
 */
import javax.swing.*;

public class ClasPrincipal {

    public static void main(String[] args) {

        String opcionesPrincipales[] = {"1. Registrar informacion del aeropuerto", "2. Reservar vuelo", "3. Mostrar Informacion Ingresada", "4. Salir del Programa"};
        String mostrarInformacion[] = {"1. Lista de aviones", "2. Lista de pilotos y copilotos", "3. Lista de clientes", "4. Lista de vuelos", "5. Salir del Menu"};
        String opcionesRegistro[] = {"1. Datos del aeropuerto", "2. Datos del avion", "3. Salir del Menu"};
        String opcionesVueloReserva[] = {"1. Adquirir boleto", "2. Imprimir boleto", "3. Cancelar vuelo", "4. Salir del Menu"};

        String opcionMenu;
        String opcionInformacion;
        String opcionRegistro;
        String opcionVueloReserva;

        do {
            opcionMenu = (String) JOptionPane.showInputDialog(null,
                    "SELECCIONE OPCION", "BIENVENIDO A NUESTRO PROGRAMA",
                    JOptionPane.INFORMATION_MESSAGE,
                    null, opcionesPrincipales, opcionesPrincipales[0]);

            switch (opcionMenu) {
                case "1. Registrar informacion del aeropuerto" -> {

                    do {
                        opcionRegistro = (String) JOptionPane.showInputDialog(null,
                                "SELECCIONE OPCION", "",
                                JOptionPane.INFORMATION_MESSAGE,
                                null, opcionesRegistro, opcionesRegistro[0]);
                        
                        
                        switch(opcionRegistro){
                            
                            case  "1. Datos del aeropuerto"->{
                                
                            }
                            
                            case "2. Datos del avion" ->{
                                
                            }
                            
                            case "3. Salir del Menu" ->{
                                
                            }
                            
                        }

                    } while (!"3. Salir del Menu".equals(opcionRegistro));

                }

                case "2. Reservar vuelo" -> {
                    
                    do{
                        opcionVueloReserva = (String) JOptionPane.showInputDialog(null,
                                "SELECCIONE OPCION", "",
                                JOptionPane.INFORMATION_MESSAGE,
                                null, opcionesVueloReserva, opcionesVueloReserva[0]);
                        
                        switch (opcionVueloReserva) {
                            case "1. Adquirir boleto" ->{
                                
                            }
                            
                            case "2. Imprimir boleto"->{
                                
                            }
                            
                            case "3. Cancelar vuelo"->{
                                
                            }
                            
                        }
                        
                    }while(!"4. Salir del Menu".equals(opcionVueloReserva));
                    
                }

                case "3. Mostrar Informacion Ingresada" -> {

                    do {
                        opcionInformacion = (String) JOptionPane.showInputDialog(null,
                                "SELECCIONE OPCION", "",
                                JOptionPane.INFORMATION_MESSAGE,
                                null, mostrarInformacion, mostrarInformacion[0]);
                        
                        
                        switch (opcionInformacion) {
                            case "1. Lista de aviones"->{
                                
                            }
                            
                            case "2. Lista de pilotos y copilotos"->{
                                
                            }
                            
                            case "3. Lista de clientes"->{
                                
                            }
                            case "4. Lista de vuelos"->{
                                
                            }
                        }

                    } while (!"5. Salir del Menu".equals(opcionInformacion));
                }

            }
        } while (!opcionMenu.equals("4. Salir del Programa"));

    }

}
