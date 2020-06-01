package patrones.bridge.ejemplo1;


public abstract class Vehiculo {
    MotorImpl motor;
    int peso;

    public void setMotor(MotorImpl motor) {
        this.motor = motor;
    }
    
    public abstract void mover();
    
    public void informacionVelocidad(int caballos_fuerza){
        int ratio = peso / caballos_fuerza;
        if(ratio<3){
            System.out.println("El vehículo va a gran velocidad");
        }else if(ratio>=3 && ratio <8){
            System.out.println("El vehículo va a velocidad moderada");
        }else{
            System.out.println("El vehículo va a baja velocidad");
        }
            
    }
   
    
}
