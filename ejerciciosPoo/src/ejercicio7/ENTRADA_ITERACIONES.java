
package ejercicio7;

import java.util.Scanner;


public class ENTRADA_ITERACIONES {
    private Scanner entrada= new Scanner(System.in);
    private TEMPERATURA objtemperatura;
    private  ESTADOAIREACONDICIONADO objEstadoaireacondicionado ;
    
    public ENTRADA_ITERACIONES( TEMPERATURA temperatura ,ESTADOAIREACONDICIONADO estadoaireacondicionado){
        this.objtemperatura=temperatura;
        this.objEstadoaireacondicionado=estadoaireacondicionado;
    }  
    
    public void IteracionesEntradas(int interaciones){
        
        for (int i=0 ; i< interaciones; i++){
            System.out.println("ingrese la temperatura: ");
            int temperatura=entrada.nextInt();
            objtemperatura.setTemperatura(temperatura);

            System.out.println("ingrese la humedad: ");
            int humeda=entrada.nextInt();
            objtemperatura.setHumeda(humeda);

            objtemperatura.actualizarEstado(objEstadoaireacondicionado);

            System.out.println("Temperatura :" + objtemperatura.getTemperatura() + " Humedad : " + objtemperatura.getHumeda() + "  Aire Acondicionado Estado: " +  objEstadoaireacondicionado.Estado() );
   
            
        }
        }
    

    
}
