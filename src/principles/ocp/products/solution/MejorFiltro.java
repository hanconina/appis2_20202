package principles.ocp.products.solution;

import java.util.ArrayList;
import java.util.List;

public class MejorFiltro implements Filtrar {

    @Override
    public List<Alumno> filtrar(List<Alumno> items, EspecificacionSimple esp) {
        List<Alumno> aux = new ArrayList<Alumno>();
        for (Alumno a : items){
            if (esp.esValido(a))
                aux.add(a);
        }
        return aux;
    }
    
}
