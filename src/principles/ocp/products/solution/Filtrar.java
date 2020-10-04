
package principles.ocp.products.solution;

import java.util.List;

public interface Filtrar {
    List<Alumno> filtrar(List<Alumno> items, EspecificacionSimple esp);        
}
