
package ejercicio5;



public class Principal {
    private static  Alarma objAlarma= new Alarma();
    
    public Principal( Alarma  alarma){
        this.objAlarma= alarma;
    }
    public static void main(String[] args) {
        
        SensorMovimiento sensor1 = new SensorMovimiento();
        SensorMovimiento sensor2 = new SensorMovimiento();
        SensorMovimiento sensor3 = new SensorMovimiento();

        sensor1.DetetarMovimiento();
        sensor2.DetetarMovimiento();
        sensor3.DetetarMovimiento();

        System.out.println("Estado de los sensores:");
        sensor1.mostrarEstado();
        sensor2.mostrarEstado();
        sensor3.mostrarEstado();

        int sensoresActivos = 0;
        if (sensor1.hayMovimiento()) sensoresActivos++;
        if (sensor2.hayMovimiento()) sensoresActivos++;
        if (sensor3.hayMovimiento()) sensoresActivos++;

        boolean esDeNoche = true; 
        if (sensoresActivos >= 2 && esDeNoche) {
           objAlarma.ActivandoAlarma();
           
        } else {
            objAlarma.AlarmaNormal();
        }
    }
    
}
