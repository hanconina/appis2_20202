
package patrones.bridge.ejemplo1;

public class Main {
    
    public static void main(String[] args) {
        Vehiculo vehiculo = new Auto(new MotorDiesel());
        vehiculo.mover();
        vehiculo.setMotor(new MotorGasolinero());
        vehiculo.mover();
    }
    
}
