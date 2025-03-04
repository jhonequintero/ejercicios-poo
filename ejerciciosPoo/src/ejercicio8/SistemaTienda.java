
package ejercicio8;


public class SistemaTienda {
    private boolean horarioAtencion;

    public SistemaTienda(boolean horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }

    public boolean permitirAcceso(Usuarios objcliente) {
        if ((objcliente.tieneMembresia() && horarioAtencion) || objcliente.esEmpleado()) {
            return true;
        }
        return false;
    }

    
}






