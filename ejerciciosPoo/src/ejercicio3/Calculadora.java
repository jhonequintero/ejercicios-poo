
package ejercicio3;


public class Calculadora {
    
    private int suma;
    private int resta;
    private int multiplicacion;
    private int division;
    
    private EntradaUsuario objUsuario;
    
    public Calculadora(EntradaUsuario numero){
        this.suma=0;
        this.resta=0;
        this.multiplicacion=0;
        this.division=0;
        this.objUsuario=numero;
        
    }
    
    public int getSuma(){
        return suma;
    }
    public int getRestas(){
        return  resta;
    }
    public int getMultiplicacion(){
        return multiplicacion;
    }
    
    public int getDivision(){
        return  division;
    }
    
    public void setSuma(int suma){
        this.suma=suma;
    }
    
    public void setResta(int resta){
        this.resta= resta;
    }
    
    public void setMultiplicacion(int multiplicacion){
        this.multiplicacion=multiplicacion;
        
    }
    public void setDivision(int division){
        this.division=division;
    }
    
    public void CalculaOperacion(){
        suma=objUsuario.getNumero1()+objUsuario.getNumero2();
        resta=objUsuario.getNumero1()-objUsuario.getNumero2();
        multiplicacion=objUsuario.getNumero1()*objUsuario.getNumero2();
       
        //  división por cero
        if (objUsuario.getNumero2() != 0) {
            division = objUsuario.getNumero1() / objUsuario.getNumero2();
        } else {
            division = 0;
            System.out.println("️ incorrectoo no se puede dividir por cero");
        }
  
    }
    
    
}
