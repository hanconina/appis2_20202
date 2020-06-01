package patrones.bridge.ejemplo1;

public class Auto extends Vehiculo{

    public Auto(MotorImpl motor) {
        this.peso = 600;
        this.motor = motor;
    }

    @Override
    public void mover() {
        System.out.println("El AUTO se está movilizando");
        int caballos_fuerza = motor.arrancar();
        informacionVelocidad(caballos_fuerza);
    }
    
}
