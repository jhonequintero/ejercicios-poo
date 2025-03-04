
package ejercicio3;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        String continuar;
        do{
            //obj entrada usuario
            EntradaUsuario objUsuario= new EntradaUsuario();

            System.out.println("\n----BIENVENIDOS AL MENU DE CALCULOS-------\n");
            System.out.println("ingrese el primer numero:");
            int numero1= entrada.nextInt();
            objUsuario.setNumero1(numero1);
            
            System.out.println("ingrese el segundo numero: ");
            int numero2= entrada.nextInt();
            objUsuario.setNumero2(numero2);
            
            objUsuario.imprimirDatos();
            int opcion = objUsuario.OperacionHacer();
            
            //objeto calculos
            Calculadora objCalculadora = new Calculadora(objUsuario);
            objCalculadora.CalculaOperacion();
            
            Operacion objOperacion= new Operacion(objCalculadora);
            objOperacion.DeterminarOperacion(opcion);
            
            
            
            System.out.println("deseas hacer otra operacion ( si / no ) ");
            continuar=entrada.next();
        }while(continuar.equalsIgnoreCase("si"));
        
        System.out.println("saliendo del programa gracias por utilizarlo.....");
        
        

    }
    
}
