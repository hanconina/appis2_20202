package patrones.bridge.ejemplo1;

public class MotorGasolinero implements MotorImpl{

    int caballos_fuerza;

    public MotorGasolinero() {
        caballos_fuerza = 100;
    }
    
    
    @Override
    public int arrancar() {
        System.out.println("El motor GASOLINERO está funcionando");
        return caballos_fuerza;
    }
    
    
}
