package principles.srp.vehiculo.solution;

public class ControladorEventos {

    private Vehiculo vehiculo;

    public ControladorEventos(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void cambiarModoCoduccion(ModoConduccion modo) {
        vehiculo.setPoderMotor(modo.getPoderMotor());
        vehiculo.setAlturaSuspension(modo.getAlturaSuspension());
    }
}
