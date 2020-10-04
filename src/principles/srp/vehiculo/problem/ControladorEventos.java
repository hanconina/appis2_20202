package principles.srp.vehiculo.problem;

enum ModoConduccion{
    SPORT, COMFORT
}

public class ControladorEventos {

    private Vehiculo vehiculo;

    public ControladorEventos(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void cambiarModoCoduccion(ModoConduccion modo) {
        switch (modo) {
            case SPORT:
                vehiculo.setPoderMotor(500);
                vehiculo.setAlturaSuspension(10);
                break;
            case COMFORT:
                vehiculo.setPoderMotor(400);
                vehiculo.setAlturaSuspension(20);
                break;
            default:
                vehiculo.setPoderMotor(200);
                vehiculo.setAlturaSuspension(30);
                break;
        }
    }

}
