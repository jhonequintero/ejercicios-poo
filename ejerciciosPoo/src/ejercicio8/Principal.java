
package ejercicio8;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean horarioAtencion = true; // Simulamos que la tienda está abierta
        SistemaTienda objtienda = new SistemaTienda(horarioAtencion);

        while (true) { 
            System.out.println("\nNuevo Cliente:");
            System.out.print("¿Tiene membresía? (true/false): ");
            boolean tieneMembresia = scanner.nextBoolean();

            System.out.print("¿Es empleado? (true/false): ");
            boolean esEmpleado = scanner.nextBoolean();

            Usuarios objUsuarios = new Usuarios(tieneMembresia, esEmpleado);
            
            if (objtienda.permitirAcceso(objUsuarios)) {
                System.out.println(" Acceso permitido a la tienda.");
            } else {
                System.out.println(" Acceso denegado.");
            }

            System.out.print("¿Desea ingresar otro cliente? (true/false): ");
            boolean continuar = scanner.nextBoolean();
            if (!continuar) break;
        }

        scanner.close();
        System.out.println("Sistema de acceso finalizado.");
    }
}
