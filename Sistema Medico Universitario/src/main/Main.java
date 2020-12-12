package main;

import persona.*;

import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//        Empleado empleado1 = new Empleado();
//        System.out.println(empleado1.getSalario());
//        empleado1.setNombre("Pedro");
//
//        Empleado empleado2 = new Empleado();
//        System.out.println(empleado2.getSalario());
//        System.out.println(empleado2.getNombre());
//
//        Empleado empleadoJean = new Empleado("Jean", 440.00D);
//        empleadoJean.consultarSueldo();
//
//        Empleado empleadoJean2 = new Medico("Pediatria");
//        empleadoJean2.getSalario();
//
//        System.out.println("Objeto generado de la clase : " + empleadoJean.getClass());
//        System.out.println("Objeto generado de la clase : " + empleadoJean2.getClass());
//
//        Empleado Juan = new Empleado();
//        Juan.setNombre("Juan");
//
//        Medico medico1 = new Medico("Maria", 500.5D, "Medico General");
//
//        medico1.toString();
//
//        Empleado secre = new Secretaria("Ana", 1000.5D);
//        System.out.println("Por favor Secretaria realizar : ");
//        System.out.println("Nombre : " + secre.getNombre() + "\nSalario es : " + secre.getSalario());
//
//        Empleado[] listaEmpleado = new Empleado[4];
//        listaEmpleado[0] = empleado1;
//        listaEmpleado[1] = secre;
//        listaEmpleado[2] = empleadoJean;
//        listaEmpleado[3] = empleadoJean2;
//
//        for (int i = 0; i < listaEmpleado.length; i++) {
//            System.out.println("Empleado [" + i + "]" + listaEmpleado[i].getNombre());
//        }
//
//        for (Empleado empleado : listaEmpleado) {
//            System.out.println("Empleado en la lista : " + empleado.getNombre());
//
//        }
//
//        for (Empleado empleado : listaEmpleado) {
//            System.out.println("Empleado en la lista : " + empleado.getNombre()+""
//                    + "         \nSalario : "+empleado.getSalario());        }
//
//    
//        ArrayList<Empleado> listaEmpleadosGenerica = new ArrayList<>();
//        
//        listaEmpleadosGenerica.add(empleado1);
//        listaEmpleadosGenerica.add(empleadoJean2);
//        listaEmpleadosGenerica.add(secre);
//        listaEmpleadosGenerica.add(Juan);
//        listaEmpleadosGenerica.add(secre);
//        
//        listaEmpleadosGenerica.forEach(val->System.out.println("\n"+val.getSalario() + val.getNombre()));
//        
////        for(Empleado empleados : listaEmpleadosGenerica){
////            System.out.println("Ver lista mediante Notacion Lamda : ");
////            listaEmpleadosGenerica.forEach(empleado->System.out.println(empleados.getNombre()));
////        }
//
//        listaEmpleadosGenerica.add(5, secre);
//
//        System.out.println("Reporte de Empleados en el Sistema Medico Universitario");
//        
//        for (Empleado empleado : listaEmpleadosGenerica) {
//            //System.out.println("Empleado en listado listaEmpleadosGenerica : "+empleado.getNombre());
//            System.out.println("Empleado : "+empleado.getNombre()+ " su Salario es : "+empleado.getSalario());
//        }
//        

//        for(Empleado empleados : listaEmpleadosGenerica){
//            listaEmpleadosGenerica.add(secre);
//        }

//Clase
//          Scanner scanner = new Scanner(System.in);
//          Medico medico = new Medico("Dr Pablo",10, "Pediatra", 500);
//          Conductor conductor = new Conductor("Marco", 10, 500, "D");
//          double sueldoMedico = medico.consultarSueldoExtra(10);
//          double sueldoConductor = conductor.consultarSueldoExtra(10);
//          System.out.println("");
//          System.out.println(sueldoMedico);
//          System.out.println(sueldoConductor);
//          
//          Empleado empleado = new Empleado() {
//              @Override
//              public double consultarSueldoExtra(int numeroHoras) throws AbstractMethodError {
//                  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//              }
//          };
//          
//          System.out.println(empleado.getNombre()+ empleado.getHorasDiarias());
//                 
//Fin Clase
          
//Deber
        Scanner scanner = new Scanner(System.in);
        System.out.println("SISTEMA MEDICO UNIVERSITARIO DE LA UNIVERSIDAD NACIONAL DE LOJA");

        ArrayList<Empleado> listaEmple = new ArrayList<Empleado>();

        int opcionMenu = 1;
        do {
            menuOpcion();
            opcionMenu = scanner.nextInt();

            switch (opcionMenu) {
                case 1 -> {
                    System.out.println("CREACION DE NUEVO EMPLEADO");
                    System.out.println("Ingrese nombre : ");
                    var nombre = scanner.next();
                    System.out.println("Ingrese numero de horas diarias : ");
                    var horasDiarias = scanner.nextInt();
                    System.out.println("Salario basico : ");
                    var salarioBasico = scanner.nextDouble();
                    Empleado empleado = new Empleado(nombre, horasDiarias, salarioBasico);
                    listaEmple.add(empleado);
                }
                case 2 -> {
                    System.out.println("MOSTRAR EL LISTADO DE EMPLEADO");
                    for (Empleado emplea : listaEmple) {
                        System.out.println("Empleado : " + emplea.getNombre() + " tiene un salario de : " + emplea.getSalario()
                                + " y trabaja : " + emplea.getHorasDiarias() + " horas diariamente");
                    }
                }
                case 3 -> {
                    System.out.println("ELIMINAR EMPLEADO");
                    Empleado empleado;
                    listaEmple.remove(empleado);
                }
                case 4 -> System.out.println("CREAR UNA FACTURA");
                default -> System.out.println("OPCION NO VALIDA");
            }

        } while (opcionMenu <= 4);

//        Empleado Juan = new Empleado("Juan", 8, 400D);
//        Medico medico = new Medico("Dr Pedro", 12, "Pediatra", 600D);
//        Secretaria secretaria = new Secretaria("Maria", 6, 450D);
//        Conductor conductor = new Conductor("Conductor Luis", 6, 440, "Licencia D");

        double calcularSueldoAdicional = 0;
        //Juan.consultarSueldo();
        double sueldoTotal = 0;
        
        
   //Fin deber
//        calcularSueldoAdicional = Juan.consultarSueldoExtra(10);
//            sueldoTotal = Juan.getSalario() + calcularSueldoAdicional;
//            

//        System.out.println("Sueldo Total : " + sueldoTotal);
//
//        ArrayList<Empleado> listaEmpleado = new ArrayList<Empleado>();
//
//        listaEmpleado.add(Juan);
//        listaEmpleado.add(medico);
//        listaEmpleado.add(secretaria);
//        listaEmpleado.add(conductor);
//
//        System.out.println("\nSueldo Basicos");
//        for (Empleado empleado : listaEmpleado) {
//            System.out.println("Empleado : " + empleado.getNombre() + " tiene un salario de : " + empleado.getSalario()
//                    + " y trabaja : " + empleado.getHorasDiarias() + " horas diariamente");
//        }
//        System.out.println("Fin sueldo basico\n");
//
//        System.out.println("Calculo Sueldo Extra");
//        for (Empleado empleado : listaEmpleado) {
//            calcularSueldoAdicional = empleado.consultarSueldoExtra(10);
//            sueldoTotal = Juan.getSalario() + calcularSueldoAdicional;
//            empleado.setSalario(sueldoTotal);
//            System.out.println("Su sueldo extra es : " + empleado.getSalario());
//        }
//
//        System.out.println("Fin sueldo Extras\n");
//
//        System.out.println("\nSueldos Totales");
//        for (Empleado empleado : listaEmpleado) {
//            System.out.println("Empleado : " + empleado.getNombre() + " tiene un salario de : " + empleado.getSalario()
//                    + " y trabaja : " + empleado.getHorasDiarias() + " horas diariamente");
//        }
//        System.out.println("Fin sueldo total\n");
//
//        double sueldoTotalEmpleados = 0;
//        for (Empleado empleado : listaEmpleado) {
//            sueldoTotalEmpleados += empleado.getSalario();
//        }
//        System.out.println(" El sueldo Total Empleados = " + sueldoTotalEmpleados);

    }

    public static void menuOpcion() {
        System.out.println("1. CREAR UN NUEVO EMPLEADO");
        System.out.println("2. MOSTRAR EL LISTADO DE EMPLEADOS");
        System.out.println("3. ELIMINAR EMPLEADO");
        System.out.println("4. CREAR UNA FACTURA");
        System.out.println("5. SALIR");

    }

}
