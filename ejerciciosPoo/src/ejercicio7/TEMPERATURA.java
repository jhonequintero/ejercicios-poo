package ejercicio7;

public class TEMPERATURA {
    private int temperatura;
    private int humeda;

    public TEMPERATURA() {
        this.temperatura = 0;
        this.humeda = 0;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public int getHumeda() {
        return humeda;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public void setHumeda(int humeda) {
        this.humeda = humeda;
    }

    public void actualizarEstado(ESTADOAIREACONDICIONADO objestadoAire) {
        if ((temperatura > 28 && humeda > 60) || temperatura > 30) {
            objestadoAire.setEncendido(true);
        } else {
            objestadoAire.setEncendido(false);
        }
    }
}
