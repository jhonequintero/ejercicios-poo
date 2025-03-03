package ejercicio4;

public class ControladorClima {
    private SensorTemperatura objsensor;
    private Ventilador objventilador;
    private Calefactor objcalefactor;

    public ControladorClima(SensorTemperatura sensor, Ventilador ventilador, Calefactor calefactor) {
        this.objsensor = sensor;
        this.objventilador = ventilador;
        this.objcalefactor = calefactor;
    }

    public void verificarClima() {
        objsensor.medirTemperatura();
        int temperatura = objsensor.getTemperatura();

        if (temperatura < 10) {
            objcalefactor.encender();
            objventilador.apagar();
        } else if (temperatura > 25) {
            objventilador.encender();
            objcalefactor.apagar();
        } else {
            System.out.println(" Temperatura estable .... apagandoo sistemas");
            objcalefactor.apagar();
            objventilador.apagar();
        }
    }
}
