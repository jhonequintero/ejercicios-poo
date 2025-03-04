package ejercicio4;

import java.util.Random;

public class SensorTemperatura {
    private int temperatura;
    private Random random = new Random();

    public SensorTemperatura() {
        this.temperatura = 0;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void medirTemperatura() {
        this.temperatura = random.nextInt(31); // Genera temperatura entre 0 y 30°C
        System.out.println("Temperatura actual: " + temperatura + "°C");
    }
}
