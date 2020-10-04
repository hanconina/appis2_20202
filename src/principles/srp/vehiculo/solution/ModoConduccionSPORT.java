
package principles.srp.vehiculo.solution;

public class ModoConduccionSPORT implements ModoConduccion{
    private final static int PoderMotor = 500;
    private final static int AlturaSuspension = 10;
    @Override
    public int getPoderMotor() {
        return PoderMotor;
    }

    @Override
    public int getAlturaSuspension() {
        return AlturaSuspension;
    }    
}
