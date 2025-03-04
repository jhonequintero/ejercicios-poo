package ejercicio1;

public class Persona {
    private String nombrePersona;
    private String apellidoPersona;
    private String idPersona;

    public Persona() {
        this.nombrePersona = "";
        this.apellidoPersona = "";
        this.idPersona = "";
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setNombrePersona(String datoNombre) {
        this.nombrePersona = datoNombre;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public void imprimirDatos() {
        System.out.println("\n--- DATOS DEL CLIENTE ---");
        System.out.println("Nombre cliente: " + this.getNombrePersona());
        System.out.println("Apellido cliente: " + this.getApellidoPersona());
        System.out.println("Cédula cliente: " + this.getIdPersona());
    }
}