package ejercicio6;

import java.util.Scanner;

public class Principal {
    private static SistemaLuces objLuces = new SistemaLuces();
    private static Scanner entrada = new Scanner(System.in);
    private static String continuar;

    public static void main(String[] args) {
        ControlLuces sensor1 = new ControlLuces();
        ControlLuces sensor2 = new ControlLuces();
        ControlLuces sensor3 = new ControlLuces();

        

        do {
            try {
                Thread.sleep(10000); // Esperar 10 segundos antes de la medición
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            sensor1.ValidarLuces();
            sensor2.ValidarLuces();
            sensor3.ValidarLuces();

            System.out.println("Estados de sensores: ");
            sensor1.MostrarEstado();
            sensor2.MostrarEstado();
            sensor3.MostrarEstado();

            int sensoresLuces = 0;
            if (sensor1.getDetectarLuces()) sensoresLuces++;
            if (sensor2.getDetectarLuces()) sensoresLuces++;
            if (sensor3.getDetectarLuces()) sensoresLuces++;

            boolean EsdeNoche = true;
            if (sensoresLuces >= 2 && EsdeNoche) {
                objLuces.conMovimiento();
            } else {
                objLuces.sinmovimiento();
            }

            System.out.println("¿Quieres seguir midiendo la temperatura? (si / no) ");
            continuar = entrada.next();

        } while (continuar.equalsIgnoreCase("si"));

        System.out.println("Saliendo...");
    }
}
