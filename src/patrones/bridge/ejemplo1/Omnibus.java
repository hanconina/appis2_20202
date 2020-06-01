package patrones.bridge.ejemplo1;

public class Omnibus extends Vehiculo{

   public Omnibus(MotorImpl motor) {
        this.peso = 3000;
        this.motor = motor;
    }

    @Override
    public void mover() {
        System.out.println("El OMNIBUS se está movilizando");
        int caballos_fuerza = motor.arrancar();
        informacionVelocidad(caballos_fuerza);
    }
    
}
