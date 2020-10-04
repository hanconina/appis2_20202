package principles.ocp.products.solution;

public class EspecificacionSemestre implements EspecificacionSimple{
    private SEMESTRE semestre;

    public EspecificacionSemestre(SEMESTRE semestre) {
        this.semestre = semestre;
    }
    @Override
    public boolean esValido(Alumno item) {
        return item.semestreActual == semestre;        
    }
    
    
}
