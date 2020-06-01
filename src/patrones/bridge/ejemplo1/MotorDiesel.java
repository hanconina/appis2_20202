package patrones.bridge.ejemplo1;

public class MotorDiesel implements MotorImpl{
    int caballos_fuerza;

    public MotorDiesel() {
        caballos_fuerza = 350;
    }
    
       
    @Override
    public int arrancar() {
        System.out.println("El motor DIESEL está funcionando");
        return caballos_fuerza;
    }
    
}
