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
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import javax.swing.*;
import modelo.*;
import controlador.*;
import java.util.*;

import java.io.IOException;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;

public class ClasePrincipal {

    public static final String DEST = "Boleto_Elegido.pdf";
    public static final String IMG = "Imagen/imagen.jpg";

    public static void main(String[] args) throws IOException {

        String opcionesPrincipales[] = {"1. Registrar informacion del aeropuerto", "2. Reservar vuelo", "3. Mostrar Informacion Ingresada", "4. Salir del Programa"};
        String mostrarInformacion[] = {"1. Lista de aviones", "2. Lista de pilotos y copilotos", "3. Lista de clientes", "4. Lista de vuelos", "5. Salir del Menu"};
        String opcionesRegistro[] = {"1. Datos del aeropuerto", "2. Crear un Avion", "3. Salir del Menu"};
        String opcionesVueloReserva[] = {"1. Adquirir boleto", "2. Imprimir boleto", "3. Cancelar vuelo", "4. Salir del Menu"};
        String opcionesInformacionAeropuerto[] = {"1. Nombre del Aeropuerto", "2. Ubicacion del Aeropuerto", "3. Capacidad del Aeropuerto", "4. Salir del Menu"};
        String opcionesVuelo[] = {"1. Vuelos Nacionales", "2. Vuelos Internacionales"};

        String opcionMenu;
        String opcionInformacion;
        String opcionRegistro;
        String opcionVueloReserva;
        String opcionVuelo;
        String imprimirBoleto;

        String opcionInformacionAeropuerto;

        //--------------------Objetos----
        Aeropuerto aeropuerto = new Aeropuerto();
        Avion avion = new Avion();
        Pasajero pasajero = new Pasajero();
        Internacional internacional = new Internacional();
        Nacional nacional = new Nacional();

        //End objects
        boolean banderaIngreso = false;
        boolean informacionAeropuerto = false;
        boolean informacionAvion = false;

        //---------------------------Controladores
        CtrlAeropuerto ctrlAeropuerto = new CtrlAeropuerto();
        CtrlAvion ctrlAvion = new CtrlAvion();

        //--------end controladores
        ArrayList<Avion> aviones = new ArrayList<>();
        ArrayList<Pasajero> pasajeros = new ArrayList<>();
        ArrayList<Vuelo> vuelos = new ArrayList<>();
        ArrayList<Nacional> nacionales = new ArrayList<>();
        ArrayList<Internacional> internacionales = new ArrayList<>();

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

                            case "2. Crear un Avion" -> {

                                String modeloAvion = JOptionPane.showInputDialog(null, "Modelo del Avion");
                                String nombreCapitan = JOptionPane.showInputDialog(null, "Nombre del Capitan");
                                String nombreCopiloto = JOptionPane.showInputDialog(null, "Nombre del Copiloto");
                                double pesoAvion = Double.parseDouble(JOptionPane.showInputDialog(null, "Peso que puede cargar el avion"));
                                int numeroPasjerosAvion = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de Pasajeros que puede llevar el avion"));
                                avion = new Avion(modeloAvion, nombreCapitan, nombreCopiloto, numeroPasjerosAvion, pesoAvion);
                                aviones.add(avion);
                                ctrlAvion.mostrarInformacionAvion(avion);
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
                                opcionVuelo = (String) JOptionPane.showInputDialog(null,
                                        "SELECCIONE OPCION", "",
                                        JOptionPane.INFORMATION_MESSAGE,
                                        null, opcionesVuelo, opcionesVuelo[0]);

                                switch (opcionVuelo) {

                                    case "1. Vuelos Nacionales" -> {
                                        JOptionPane.showMessageDialog(null, "Datos del Cliente", "Datos del Cliente", 1);

                                        String nombreCliente = JOptionPane.showInputDialog(null, "Nombre del Cliente");
                                        int cedulaCliente = Integer.parseInt(JOptionPane.showInputDialog(null, "Cedula del Pasajero"));
                                        String emailCliente = JOptionPane.showInputDialog(null, "Email del Cliente");
                                        String pasaporteCliente = JOptionPane.showInputDialog(null, "Pasaporte del Cliente");
                                        pasajero = new Pasajero(nombreCliente, cedulaCliente, emailCliente, pasaporteCliente);

                                        JOptionPane.showMessageDialog(null, "Datos del Vuelo", "Datos del Vuelo", 1);

                                        int numeroVuelo = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de su vuelo"));
                                        String origenVuelo = JOptionPane.showInputDialog(null, "Origen de su vuelo");
                                        String destinoVuelo = JOptionPane.showInputDialog(null, "Destino de su vuelo");
                                        int asientoVuelo = Integer.parseInt(JOptionPane.showInputDialog(null, "Nro. de asiento"));
                                        double costoVuelo = Double.parseDouble(JOptionPane.showInputDialog(null, "Costo del Vuelo"));
                                        double duracionVuelo = Double.parseDouble(JOptionPane.showInputDialog(null, "Duracion del Vuelo en horas"));

                                        nacional = new Nacional(numeroVuelo, origenVuelo, destinoVuelo, asientoVuelo, costoVuelo, duracionVuelo, pasajero);
                                        nacionales.add(nacional);
                                    }

                                    case "2. Vuelos Internacionales" -> {
                                        JOptionPane.showMessageDialog(null, "Datos del Cliente", "Datos del Cliente", 1);

                                        String nombreCliente = JOptionPane.showInputDialog(null, "Nombre del Cliente");
                                        int cedulaCliente = Integer.parseInt(JOptionPane.showInputDialog(null, "Cedula del Pasajero"));
                                        String emailCliente = JOptionPane.showInputDialog(null, "Email del Cliente");
                                        String pasaporteCliente = JOptionPane.showInputDialog(null, "Pasaporte del Cliente");
                                        pasajero = new Pasajero(nombreCliente, cedulaCliente, emailCliente, pasaporteCliente);

                                        JOptionPane.showMessageDialog(null, "Datos del Vuelo", "Datos del Vuelo", 1);
                                        double impuesto = 20;
                                        int numeroVuelo = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de su vuelo"));
                                        String origenVuelo = JOptionPane.showInputDialog(null, "Origen de su vuelo");
                                        String destinoVuelo = JOptionPane.showInputDialog(null, "Destino de su vuelo");
                                        int asientoVuelo = Integer.parseInt(JOptionPane.showInputDialog(null, "Nro. de asiento"));
                                        double costoVuelo = Double.parseDouble(JOptionPane.showInputDialog(null, "Costo del Vuelo"));
                                        double duracionVuelo = Double.parseDouble(JOptionPane.showInputDialog(null, "Duracion del Vuelo en horas"));

                                        internacional = new Internacional(impuesto, numeroVuelo, origenVuelo, destinoVuelo, asientoVuelo, costoVuelo, duracionVuelo, pasajero);
                                        internacionales.add(internacional);
                                    }
                                }
                            }

                            case "2. Imprimir boleto" -> {
                                int i = 0;
                                imprimirBoleto = (String) JOptionPane.showInputDialog(null,
                                        "SELECCIONE OPCION", "",
                                        JOptionPane.INFORMATION_MESSAGE,
                                        null, opcionesVuelo, opcionesVuelo[0]);

                                switch (imprimirBoleto) {

                                    case "1. Vuelos Nacionales" -> {
                                        for (Nacional todosNacionales : nacionales) {
                                            System.out.println("\n\n===========Datos del Cliente===========");
                                            System.out.println(i + ") Nombre del Cliente : " + todosNacionales.getPasajero().getNombre());
                                            System.out.println(i + ") Cedula del Cliente : " + todosNacionales.getPasajero().getCedula());

                                            System.out.println("===========Datos del Vuelo===========");
                                            System.out.println(i + ") Origen del Vuelo : " + todosNacionales.getOrigen());
                                            System.out.println(i + ") Destino del Vuelo : " + todosNacionales.getDestino());
                                            System.out.println(i + ") Costo del Vuelo : " + todosNacionales.getCosto());
                                            i++;
                                        }
                                        int indice = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el indice que desea imprimir"));
                                        crearPdfVuelosNacionales(indice, nacionales);
                                        abrirDocumento();
                                    }

                                    case "2. Vuelos Internacionales" -> {
                                        i = 0;
                                        for (Internacional todosInternacionales : internacionales) {
                                            System.out.println("\n\n===========Datos del Cliente===========");
                                            System.out.println(i + ") Nombre del Cliente : " + todosInternacionales.getPasajero().getNombre());
                                            System.out.println(i + ") Cedula del Cliente : " + todosInternacionales.getPasajero().getCedula());

                                            System.out.println("===========Datos del Vuelo===========");
                                            System.out.println(i + ") Origen del Vuelo : " + todosInternacionales.getOrigen());
                                            System.out.println(i + ") Destino del Vuelo : " + todosInternacionales.getDestino());
                                            System.out.println(i + ") Costo del Vuelo : " + todosInternacionales.getCosto());
                                            i++;
                                        }
                                        int indice = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el indice que desea imprimir "));
                                        crearPdfVuelosInternacionales(indice, internacionales);
                                        abrirDocumento();
                                    }
                                }
                            }

                            case "3. Cancelar vuelo" -> {
                                int i = 0;
                                opcionVuelo = (String) JOptionPane.showInputDialog(null,
                                        "SELECCIONE OPCION", "",
                                        JOptionPane.INFORMATION_MESSAGE,
                                        null, opcionesVuelo, opcionesVuelo[0]);

                                switch (opcionVuelo) {

                                    case "1. Vuelos Nacionales" -> {

                                        for (Nacional todosNacionales : nacionales) {
                                            System.out.println("\n\n===========Datos del Cliente===========");
                                            System.out.println(i + ") Nombre del Cliente : " + todosNacionales.getPasajero().getNombre());
                                            System.out.println(i + ") Cedula del Cliente : " + todosNacionales.getPasajero().getCedula());

                                            System.out.println("===========Datos del Vuelo===========");
                                            System.out.println(i + ") Origen del Vuelo : " + todosNacionales.getOrigen());
                                            System.out.println(i + ") Destino del Vuelo : " + todosNacionales.getDestino());
                                            System.out.println(i + ") Costo del Vuelo : " + todosNacionales.getCosto());
                                            i++;
                                        }
                                        int indice = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el indice a eliminar"));
                                        nacionales.remove(indice);
                                        System.out.println("\n\n\n\n\n\n\n");
                                        i = 0;
                                        for (Nacional todosNacionales : nacionales) {
                                            System.out.println("\n\n===========Datos del Cliente===========");
                                            System.out.println(i + ") Nombre del Cliente : " + todosNacionales.getPasajero().getNombre());
                                            System.out.println(i + ") Cedula del Cliente : " + todosNacionales.getPasajero().getCedula());

                                            System.out.println("===========Datos del Vuelo===========");
                                            System.out.println(i + ") Origen del Vuelo : " + todosNacionales.getOrigen());
                                            System.out.println(i + ") Destino del Vuelo : " + todosNacionales.getDestino());
                                            System.out.println(i + ") Costo del Vuelo : " + todosNacionales.getCosto());
                                            i++;
                                        }
                                    }

                                    case "2. Vuelos Internacionales" -> {
                                        i = 0;
                                        for (Internacional todosInternacionales : internacionales) {
                                            System.out.println("\n\n===========Datos del Cliente===========");
                                            System.out.println(i + ") Nombre del Cliente : " + todosInternacionales.getPasajero().getNombre());
                                            System.out.println(i + ") Cedula del Cliente : " + todosInternacionales.getPasajero().getCedula());

                                            System.out.println("===========Datos del Vuelo===========");
                                            System.out.println(i + ") Origen del Vuelo : " + todosInternacionales.getOrigen());
                                            System.out.println(i + ") Destino del Vuelo : " + todosInternacionales.getDestino());
                                            System.out.println(i + ") Costo del Vuelo : " + todosInternacionales.getCosto());
                                            i++;
                                        }
                                        int indice = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el indice a eliminar"));
                                        internacionales.remove(indice);
                                        i = 0;
                                        System.out.println("\n\n\n\n\n\n\n");
                                        for (Internacional todosInternacionales : internacionales) {
                                            System.out.println("\n\n===========Datos del Cliente===========");
                                            System.out.println(i + ") Nombre del Cliente : " + todosInternacionales.getPasajero().getNombre());
                                            System.out.println(i + ") Cedula del Cliente : " + todosInternacionales.getPasajero().getCedula());

                                            System.out.println("===========Datos del Vuelo===========");
                                            System.out.println(i + ") Origen del Vuelo : " + todosInternacionales.getOrigen());
                                            System.out.println(i + ") Destino del Vuelo : " + todosInternacionales.getDestino());
                                            System.out.println(i + ") Costo del Vuelo : " + todosInternacionales.getCosto());
                                            i++;
                                        }
                                    }
                                }
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
                            int i = 1;

                            opcionInformacion = (String) JOptionPane.showInputDialog(null,
                                    "SELECCIONE OPCION", "",
                                    JOptionPane.INFORMATION_MESSAGE,
                                    null, mostrarInformacion, mostrarInformacion[0]);

                            switch (opcionInformacion) {

                                case "1. Lista de aviones" -> {

                                    if (aviones.isEmpty() == true) {
                                        JOptionPane.showMessageDialog(null, "AUN NO HAS INGRESADO ALGUN DATO DEL AVION!!!"
                                                + "\nINTENTALO NUEVAMENTE!!!", "OYE AMIGO!!!", JOptionPane.ERROR_MESSAGE);
                                    }else{  
                                        for (Avion todosLosAviones : aviones) {
                                            System.out.println("\nAvion Nro." + i + "\n");
                                            System.out.println(i + ") Modelo Avion : " + todosLosAviones.getModelo());
                                            System.out.println(i + ") Capacidad Avion : " + todosLosAviones.getCapacidad());
                                            System.out.println(i + ") Peso de Carga : " + todosLosAviones.getPeso());
                                            i++;
                                        }
                                    }
                                }

                                case "2. Lista de pilotos y copilotos" -> {
                                    if(aviones.isEmpty() == true){
                                        JOptionPane.showMessageDialog(null, "AUN NO HAS INGRESADO ALGUN DATO DEL AVION!!!"
                                                + "\nINTENTALO NUEVAMENTE!!!", "OYE AMIGO!!!", JOptionPane.ERROR_MESSAGE);
                                    }else{
                                        for (Avion todosLosAviones : aviones) {
                                            System.out.println("\nPiloto y Copiloto Nro." + i + "\n");
                                            System.out.println(i + ") Piloto : " + todosLosAviones.getModelo());
                                            System.out.println(i + ") Copiloto : " + todosLosAviones.getCapacidad());
                                            i++;
                                        }                                        
                                    }
                                }

                                case "3. Lista de clientes" -> {
                                    
                                    if(nacionales.isEmpty() == true){
                                        JOptionPane.showMessageDialog(null, "AUN NO HAS INGRESADO DATOS DE CLIENTE!!!"
                                                + "\nINTENTALO NUEVAMENTE!!!", "OYE AMIGO!!!", JOptionPane.ERROR_MESSAGE);
                                    }else{
                                        System.out.println("\n\n===========Clientes de Vuelos Nacionales===========");
                                        for (Nacional todosNacionales : nacionales) {
                                            System.out.println("\n\n===========Datos del Cliente===========");
                                            System.out.println(i + ") Nombre del Cliente : " + todosNacionales.getPasajero().getNombre());
                                            System.out.println(i + ") Cedula del Cliente : " + todosNacionales.getPasajero().getCedula());
                                            System.out.println(i + ") Email del Cliente : " + todosNacionales.getPasajero().getEmail());
                                            System.out.println(i + ") Pasaporte del Cliente : " + todosNacionales.getPasajero().getPasaporte());
                                            i++;
                                        }
                                    }
                                    
                                    if(internacionales.isEmpty() == true){
                                        JOptionPane.showMessageDialog(null, "AUN NO HAS INGRESADO DATOS DE CLIENTE!!!"
                                                + "\nINTENTALO NUEVAMENTE!!!", "OYE AMIGO!!!", JOptionPane.ERROR_MESSAGE);
                                    }else{
                                        i = 0;
                                        System.out.println("\n\n===========Clientes de Vuelos Internacionales===========");
                                        for (Internacional todosInternacionales : internacionales) {
                                            System.out.println("\n\n===========Datos del Cliente===========");
                                            System.out.println(i + ") Nombre del Cliente : " + todosInternacionales.getPasajero().getNombre());
                                            System.out.println(i + ") Cedula del Cliente : " + todosInternacionales.getPasajero().getCedula());
                                            System.out.println(i + ") Email del Cliente : " + todosInternacionales.getPasajero().getEmail());
                                            System.out.println(i + ") Pasaporte del Cliente : " + todosInternacionales.getPasajero().getPasaporte());
                                            i++;
                                        }                                        
                                    }
                                }

                                case "4. Lista de vuelos" -> {
                                    if(nacionales.isEmpty() == true){
                                        JOptionPane.showMessageDialog(null, "AUN NO HAS INGRESADO DATOS DE VUELOS!!!"
                                                + "\nINTENTALO NUEVAMENTE!!!", "OYE AMIGO!!!", JOptionPane.ERROR_MESSAGE);
                                    }else{                                        
                                        System.out.println("===========Vuelos Nacionales===========");
                                        for (Nacional todosNacionales : nacionales) {
                                            System.out.println("===========Datos del Vuelo===========");
                                            System.out.println(i + ") Numero del Vuelo: " + todosNacionales.getNumeroVuelo());
                                            System.out.println(i + ") Origen de Vuelo : " + todosNacionales.getOrigen());
                                            System.out.println(i + ") Destino de Vuelo : " + todosNacionales.getDestino());
                                            System.out.println(i + ") Nro. de asiento del Vuelo : " + todosNacionales.getNumeroAsiento());
                                            System.out.println(i + ") Costo del Vuelo : " + todosNacionales.getCosto());
                                            System.out.println(i + ") Duracion del Vuelo : " + todosNacionales.getDuracion());
                                            i++;
                                        }
                                    }
                                    
                                    if(internacionales.isEmpty() == true){
                                       JOptionPane.showMessageDialog(null, "AUN NO HAS INGRESADO DATOS DE VUELOS!!!"
                                                + "\nINTENTALO NUEVAMENTE!!!", "OYE AMIGO!!!", JOptionPane.ERROR_MESSAGE); 
                                    }else{
                                        i = 0;
                                        System.out.println("===========Vuelos Internacionales===========");
                                        for (Internacional todosInternacionales : internacionales) {
                                            System.out.println("===========Datos del Vuelo===========");
                                            System.out.println(i + ") Numero del Vuelo: " + todosInternacionales.getNumeroVuelo());
                                            System.out.println(i + ") Origen de Vuelo : " + todosInternacionales.getOrigen());
                                            System.out.println(i + ") Destino de Vuelo : " + todosInternacionales.getDestino());
                                            System.out.println(i + ") Nro. de asiento del Vuelo : " + todosInternacionales.getNumeroAsiento());
                                            System.out.println(i + ") Costo del Vuelo : " + todosInternacionales.getCosto());
                                            System.out.println(i + ") Duracion del Vuelo : " + todosInternacionales.getDuracion());
                                            i++;
                                        }                                        
                                    }                                  
                                }
                            }
                        } while (!"5. Salir del Menu".equals(opcionInformacion));
                    }
                }
            }
        } while (!opcionMenu.equals("4. Salir del Programa"));

    }

    public static void crearPdfVuelosNacionales(int indice, ArrayList<Nacional> nacionales) throws IOException {
        try {

            PdfWriter writer = new PdfWriter(DEST);
            PdfDocument pdfD = new PdfDocument(writer);
            Document document = new Document(pdfD);
            Image encabezado = new Image(ImageDataFactory.create(IMG));
            document.add(encabezado);

            document.add(new Paragraph("==========================Datos del Cliente========================="));
            document.add(new Paragraph("Nombre del Cliente : " + nacionales.get(indice).getPasajero().getNombre()));
            document.add(new Paragraph("Cedula del Cliente : " + nacionales.get(indice).getPasajero().getCedula()));
            document.add(new Paragraph("Email del Cliente : " + nacionales.get(indice).getPasajero().getEmail()));
            document.add(new Paragraph("Pasaporte del Cliente : " + nacionales.get(indice).getPasajero().getPasaporte()));
            document.add(new Paragraph("================================================================="));
            document.add(new Paragraph("\n==========================Datos del Vuelo=========================="));
            document.add(new Paragraph("Numero del Vuelo : " + nacionales.get(indice).getNumeroVuelo()));
            document.add(new Paragraph("Origen del Vuelo : " + nacionales.get(indice).getOrigen()));
            document.add(new Paragraph("Destino del Vuelo : " + nacionales.get(indice).getDestino()));
            document.add(new Paragraph("Nro. de asiento del Vuelo : " + nacionales.get(indice).getNumeroAsiento()));
            document.add(new Paragraph("Costo del Vuelo : " + nacionales.get(indice).getNumeroAsiento()));
            document.add(new Paragraph("Duracion del Vuelo : " + nacionales.get(indice).getDuracion()));
            document.add(new Paragraph("================================================================="));
            JOptionPane.showMessageDialog(null, "Documento Creado");
            document.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public static void crearPdfVuelosInternacionales(int indice, ArrayList<Internacional> internacionales) throws IOException {
        try {

            PdfWriter writer = new PdfWriter(DEST);
            PdfDocument pdfD = new PdfDocument(writer);
            Document document = new Document(pdfD);
            Image encabezado = new Image(ImageDataFactory.create(IMG));

            document.add(encabezado);
            document.add(new Paragraph("==========================Datos del Cliente========================="));
            document.add(new Paragraph("Nombre del Cliente : " + internacionales.get(indice).getPasajero().getNombre()));
            document.add(new Paragraph("Cedula del Cliente : " + internacionales.get(indice).getPasajero().getCedula()));
            document.add(new Paragraph("Email del Cliente : " + internacionales.get(indice).getPasajero().getEmail()));
            document.add(new Paragraph("Pasaporte del Cliente : " + internacionales.get(indice).getPasajero().getPasaporte()));
            document.add(new Paragraph("================================================================="));
            document.add(new Paragraph("\n==========================Datos del Vuelo=========================="));
            document.add(new Paragraph("Numero del Vuelo : " + internacionales.get(indice).getNumeroVuelo()));
            document.add(new Paragraph("Origen del Vuelo : " + internacionales.get(indice).getOrigen()));
            document.add(new Paragraph("Destino del Vuelo : " + internacionales.get(indice).getDestino()));
            document.add(new Paragraph("Nro. de asiento del Vuelo : " + internacionales.get(indice).getNumeroAsiento()));
            document.add(new Paragraph("Costo del Vuelo : " + internacionales.get(indice).getNumeroAsiento()));
            document.add(new Paragraph("Duracion del Vuelo : " + internacionales.get(indice).getDuracion()));
            document.add(new Paragraph("================================================================="));
            JOptionPane.showMessageDialog(null, "Documento Creado");
            document.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public static void abrirDocumento() {
        try {
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + DEST);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
