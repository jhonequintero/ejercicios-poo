package ejercicio1;

public class Asientos {
     private int asientosDisponibles;
    private int totalReservas;
    private Sala objSala;

    public Asientos(Sala sala) {
        this.asientosDisponibles = 100;
        this.totalReservas = 0;
        this.objSala = sala;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public int getTotalReservas() {
        return totalReservas;
    }
    
    public void reservarAsientos(int cantidad) {
        if (cantidad > asientosDisponibles) {
            System.out.println(" No hay suficientes asientos. Disponibles: " + asientosDisponibles);
        } else {
            asientosDisponibles -= cantidad;
            totalReservas += cantidad;
            System.out.println(" Reserva exitosa. Has reservado " + cantidad + " asientos.");
        }
    }

    public void cancelarReservas(int cantidad) {
        if (cantidad > totalReservas) {
            System.out.println(" No puedes cancelar más asientos.");
        } else {
            asientosDisponibles += cantidad;
            totalReservas -= cantidad;
            System.out.println(" Cancelación exitosa. Se canselaron " + cantidad + " asientos.");
        }
    }

    public void imprimirDatos() {
        System.out.println("\n ------ESTADO DE LA SALA-----");
        System.out.println("Asientos Disponibles dn nuestra sala: " + this.getAsientosDisponibles());
        System.out.println("Asientos Reservados: " + this.getTotalReservas());
    }
}
