
package principles.srp.vehiculo.solution;

public class ModoConduccionCOMFORT implements ModoConduccion{
    private final static int PoderMotor = 400;
    private final static int AlturaSuspension = 20;
    @Override
    public int getPoderMotor() {
        return PoderMotor;
    }

    @Override
    public int getAlturaSuspension() {
        return AlturaSuspension;
    }    
}