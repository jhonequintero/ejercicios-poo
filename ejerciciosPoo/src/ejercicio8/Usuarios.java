
package ejercicio8;

public class Usuarios {
    
    private boolean tieneMembresia;
    private boolean esEmpleado;

    public Usuarios(boolean tieneMembresia, boolean esEmpleado) {
        this.tieneMembresia = tieneMembresia;
        this.esEmpleado = esEmpleado;
    }

    public boolean tieneMembresia() {
        return tieneMembresia;
    }

    public boolean esEmpleado() {
        return esEmpleado;
    }
}


    
