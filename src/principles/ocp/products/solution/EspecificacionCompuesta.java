
package principles.ocp.products.solution;

public class EspecificacionCompuesta implements EspecificacionSimple{
    private EspecificacionSimple primero, segundo;

    public EspecificacionCompuesta(EspecificacionSimple primero, 
            EspecificacionSimple segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    @Override
    public boolean esValido(Alumno item) {
        return primero.esValido(item) && segundo.esValido(item);
    }
}
