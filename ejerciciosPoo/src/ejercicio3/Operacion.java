
package ejercicio3;


public class Operacion {
    private Calculadora objCalculadora;
    public Operacion(Calculadora calculos){
        this.objCalculadora=calculos;
    }
    
    public void DeterminarOperacion(int opcion){
        if (opcion ==1){
            objCalculadora.getSuma();
            System.out.println("resultado suma: " + objCalculadora.getSuma());
        }
        else if (opcion ==2){
            objCalculadora.getRestas();
            System.out.println("resultado resta: " + objCalculadora.getRestas());
        }
        else if (opcion ==3 ){
            objCalculadora.getMultiplicacion();
            System.out.println("resultado multiplicacion: " + objCalculadora.getMultiplicacion());
        }
        else if (opcion ==4){
            objCalculadora.getDivision();
            System.out.println("resultado division: " + objCalculadora.getDivision());
        }
        else{
            System.out.println("opcion invalidad....");
        }
    }
}
