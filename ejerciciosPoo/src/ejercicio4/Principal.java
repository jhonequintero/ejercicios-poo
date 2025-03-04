package ejercicio4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String continuar;

        SensorTemperatura objsensor = new SensorTemperatura();
        Calefactor objcalefactor = new Calefactor();
        Ventilador objventilador = new Ventilador();
        ControladorClima objcontrolador = new ControladorClima(objsensor, objventilador, objcalefactor);

        do {
            try {
                Thread.sleep(5000); // Esperar 5 segundos antes de la medición
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            objcontrolador.verificarClima();

            System.out.println("¿Quieres seguir midiendo la temperatura? (si / no) ");
            continuar = entrada.nextLine();

        } while (continuar.equalsIgnoreCase("si"));

        System.out.println("Medición finalizada.");
    }
}
