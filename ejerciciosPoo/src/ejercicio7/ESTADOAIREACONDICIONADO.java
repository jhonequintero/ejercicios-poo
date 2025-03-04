
package ejercicio7;


public class ESTADOAIREACONDICIONADO {
    private boolean encendido;
     
    public ESTADOAIREACONDICIONADO(){
        this.encendido=false;
    }
    
    public String Estado(){
        if (encendido){
            return "el aire esta encendido......";
        }
        else{
            return  "el aire esta apagadoooo.....";
            
        }
    }
    
    
    public void setEncendido(boolean estado) {
        this.encendido = estado;
    }
}
   
 