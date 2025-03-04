package ejercicio1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //  obj cliente
        Persona objPersona = new Persona();
        System.out.println("Digite el nombre:");
        String datoNombre = entrada.nextLine();
        objPersona.setNombrePersona(datoNombre);

        System.out.println("Digite el apellido:");
        String datoApellido = entrada.nextLine();
        objPersona.setApellidoPersona(datoApellido);

        System.out.println("Digite la cédula:");
        String datoCedula = entrada.nextLine();
        objPersona.setIdPersona(datoCedula);
        
        objPersona.imprimirDatos();

        // obj sala
        Sala objSala = new Sala();
        System.out.println("Digite el ID de la sala:");
        objSala.setIdSala(entrada.nextLine());

        System.out.println("Digite el tipo de sala:");
        objSala.setTipoSala(entrada.nextLine());

        objSala.setCliente(objPersona);

        //  Cobj asientos
        Asientos objAsientos = new Asientos(objSala);

        int opcion;
        do {
            System.out.println("------ MENÚ DE OPCIONES:");
            System.out.println("1) Reservar asientos");
            System.out.println("2) Cancelar reserva");
            System.out.println("3) Ver estado de la sala");
            System.out.println("4) Salir") ;
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese cantidad de asientos a reservar:");
                    int cantidadReservar = entrada.nextInt();
                    objAsientos.reservarAsientos(cantidadReservar);

                    break;
                case 2:
                    System.out.println("Ingrese cantidad de asientos a cancelar:");
                    int cantidadCancelar = entrada.nextInt();
                    objAsientos.cancelarReservas(cantidadCancelar);

                    break;
                case 3:
                    objSala.imprimirDatos();
                    objAsientos.imprimirDatos();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println(" Opción inválida.");
            }
        } while (opcion != 4);

        //entrada.close();
    }
}
