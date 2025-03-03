
package ejercicio3;

import java.util.Scanner;


public class EntradaUsuario {
    private  int numero1;
    private int numero2;
    private Scanner entrada = new Scanner(System.in);
    public EntradaUsuario(){
        this.numero1=0;
        this.numero2=0;
    }
    
    public int getNumero1(){
        return  numero1;
    }
    public int getNumero2(){
        return numero2;
    }
    
    public void setNumero1(int numero1){
        this.numero1=numero1;
    }
    
    public void setNumero2(int numero2){
        this.numero2=numero2;
    }
    
    public void imprimirDatos(){
        System.out.println("\n-----NUMEROS INGRESADOS-------\n");
        System.out.println("numero 1: " + this.getNumero1());
        System.out.println("numero 2: " +  this.getNumero2());
    }
    
    public int  OperacionHacer(){
        int opcion;
        System.out.println("\n------MENU DE OPERACIONES------\n");
        System.out.println("1) suma");
        System.out.println("2) resta ");
        System.out.println("3) multiplicacion ");
        System.out.println("4) division..");
        System.out.println("ingrese la opcion que deseas realizar ");
        opcion=entrada.nextInt();
        return opcion; 
        
    }
}
