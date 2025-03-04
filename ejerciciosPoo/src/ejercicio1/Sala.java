package ejercicio1;

public class Sala {
    private String idSala;
    private String tipoSala;
    private Persona objCliente;

    public Sala() {
        this.idSala = "";
        this.tipoSala = "";
        this.objCliente = null;
    }

    public String getIdSala() {
        return idSala;
    }
    public String getTipoSala() {
        return tipoSala;
    }

    public void setIdSala(String idSala) {
        this.idSala = idSala;
    }

    public void setTipoSala(String tipoSala) {
        this.tipoSala = tipoSala;
    }

    public void setCliente(Persona cliente) {
        this.objCliente = cliente;
    }

    public void imprimirDatos() {
        System.out.println("\n INFORMACIÓN DE LA SALA");
        System.out.println("ID Sala: " + idSala);
        System.out.println("Tipo de Sala: " + this.getTipoSala());
        if (objCliente != null) {
            System.out.println("Cliente: " + objCliente.getNombrePersona() + " -- " + objCliente.getApellidoPersona());
        } else {
            System.out.println("No hay cliente asignado.");
        }
    }
}
