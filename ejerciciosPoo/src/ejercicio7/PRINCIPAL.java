package ejercicio7;

import java.util.Scanner;

public class PRINCIPAL {
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("--------BIENVENIDO A LA SIMULACIÓN DE AIRE ACONDICIONADO-------\n");
        System.out.println("Ingrese la cantidad de veces que quieres ingresar valores:");
        int iteraciones = entrada.nextInt();

        TEMPERATURA temperatura = new TEMPERATURA();
        ESTADOAIREACONDICIONADO estadoaireacondicionado = new ESTADOAIREACONDICIONADO();

        ENTRADA_ITERACIONES objEntrada_iteraciones = new ENTRADA_ITERACIONES(temperatura, estadoaireacondicionado);
        objEntrada_iteraciones.IteracionesEntradas(iteraciones);
    }
}
