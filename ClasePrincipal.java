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
import modelo.Aeropuerto;
import controlador.*;

public class ClasePrincipal {

    public static void main(String[] args) {

        String opcionesPrincipales[] = {"1. Registrar informacion del aeropuerto", "2. Reservar vuelo", "3. Mostrar Informacion Ingresada", "4. Salir del Programa"};
        String mostrarInformacion[] = {"1. Lista de aviones", "2. Lista de pilotos y copilotos", "3. Lista de clientes", "4. Lista de vuelos", "5. Salir del Menu"};
        String opcionesRegistro[] = {"1. Datos del aeropuerto", "2. Datos del avion", "3. Salir del Menu"};
        String opcionesVueloReserva[] = {"1. Adquirir boleto", "2. Imprimir boleto", "3. Cancelar vuelo", "4. Salir del Menu"};
        String opcionesInformacionAeropuerto[] = {"1. Nombre del Aeropuerto", "2. Ubicacion del Aeropuerto", "3. Capacidad del Aeropuerto", "4. Salir del Menu"};

        String opcionMenu;
        String opcionInformacion;
        String opcionRegistro;
        String opcionVueloReserva;

        String opcionInformacionAeropuerto;

        Aeropuerto aeropuerto = new Aeropuerto();

        boolean banderaIngreso = false;
        boolean informacionAeropuerto = false;

        //---------------------------Controladores
        CtrlAeropuerto ctrlAeropuerto = new CtrlAeropuerto();

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

                        switch (opcionRegistro) {

                            case "1. Datos del aeropuerto" -> {

                                if (!informacionAeropuerto) {
                                    String nombreAeropuerto = JOptionPane.showInputDialog(null, "Nombre del Aeropuerto");
                                    String ubicacionAeropuerto = JOptionPane.showInputDialog(null, "Ubicacion del Aeropuerto");
                                    int capacidadAeropuerto = Integer.parseInt(JOptionPane.showInputDialog(null, "Capacidad del Aeropuerto"));
                                    aeropuerto = new Aeropuerto(nombreAeropuerto, ubicacionAeropuerto, capacidadAeropuerto);
                                    informacionAeropuerto = true;
                                } else {
                                    do {
                                        opcionInformacionAeropuerto = (String) JOptionPane.showInputDialog(null,
                                                "¿Que Informacion desea cambiar?", "",
                                                JOptionPane.INFORMATION_MESSAGE,
                                                null, opcionesInformacionAeropuerto, opcionesInformacionAeropuerto[0]);

                                        switch (opcionInformacionAeropuerto) {
                                            case "1. Nombre del Aeropuerto" -> {
                                                String nombreAeropuerto = JOptionPane.showInputDialog(null, "Nombre del Aeropuerto");
                                                aeropuerto.setNombre(nombreAeropuerto);
                                            }

                                            case "2. Ubicacion del Aeropuerto" -> {
                                                String ubicacionAeropuerto = JOptionPane.showInputDialog(null, "Ubicacion del Aeropuerto");
                                                aeropuerto.setUbicacion(ubicacionAeropuerto);
                                            }

                                            case "3. Capacidad del Aeropuerto" -> {
                                                int capacidadAeropuerto = Integer.parseInt(JOptionPane.showInputDialog(null, "Capacidad del Aeropuerto"));
                                                aeropuerto.setCapacidad(capacidadAeropuerto);
                                            }
                                        }
                                    } while (!"4. Salir del Menu".equals(opcionInformacionAeropuerto));

                                }
                                ctrlAeropuerto.mostrarInformacionAeropuerto(aeropuerto);
                            }

                            case "2. Datos del avion" -> {

                            }

                        }
                        banderaIngreso = true;

                    } while (!"3. Salir del Menu".equals(opcionRegistro));

                }

                case "2. Reservar vuelo" -> {

                    do {
                        opcionVueloReserva = (String) JOptionPane.showInputDialog(null,
                                "SELECCIONE OPCION", "",
                                JOptionPane.INFORMATION_MESSAGE,
                                null, opcionesVueloReserva, opcionesVueloReserva[0]);

                        switch (opcionVueloReserva) {
                            case "1. Adquirir boleto" -> {

                            }

                            case "2. Imprimir boleto" -> {

                            }

                            case "3. Cancelar vuelo" -> {

                            }

                        }
                        banderaIngreso = true;

                    } while (!"4. Salir del Menu".equals(opcionVueloReserva));

                }

                case "3. Mostrar Informacion Ingresada" -> {

                    if (!banderaIngreso) {
                        JOptionPane.showMessageDialog(null, "AUN NO HAS INGRESADO ALGUN DATO!!!"
                                + "\nINTENTALO NUEVAMENTE!!!", "OYE AMIGO!!!", JOptionPane.ERROR_MESSAGE);

                    } else {
                        do {
                            opcionInformacion = (String) JOptionPane.showInputDialog(null,
                                    "SELECCIONE OPCION", "",
                                    JOptionPane.INFORMATION_MESSAGE,
                                    null, mostrarInformacion, mostrarInformacion[0]);

                            switch (opcionInformacion) {
                                case "1. Lista de aviones" -> {

                                }

                                case "2. Lista de pilotos y copilotos" -> {

                                }

                                case "3. Lista de clientes" -> {

                                }
                                case "4. Lista de vuelos" -> {

                                }
                            }

                        } while (!"5. Salir del Menu".equals(opcionInformacion));
                    }

                }

            }
        } while (!opcionMenu.equals("4. Salir del Programa"));

    }

}
