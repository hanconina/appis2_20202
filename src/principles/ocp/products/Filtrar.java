package principles.ocp.products;

import java.util.ArrayList;
import java.util.List;

public class Filtrar {

    public List<Alumno> porCarrera(List<Alumno> lista, CARRERA carrera) {
        List<Alumno> listaTemp = new ArrayList<Alumno>();
        for (Alumno a : lista) {
            if (a.carrera == carrera) {
                listaTemp.add(a);
            }
        }
        return listaTemp;
    }

    public List<Alumno> porSemestre(List<Alumno> lista, SEMESTRE semestre) {
        List<Alumno> listaTemp = new ArrayList<Alumno>();
        for (Alumno a : lista) {
            if (a.semestreActual == semestre) {
                listaTemp.add(a);
            }
        }
        return listaTemp;
    }

    public List<Alumno> porCarreraYSemestre(List<Alumno> lista, 
            CARRERA carrera,
            SEMESTRE semestre
            ) {
        List<Alumno> listaTemp = new ArrayList<Alumno>();
        for (Alumno a : lista) {
            if (a.carrera == carrera && a.semestreActual == semestre) {
                listaTemp.add(a);
            }
        }
        return listaTemp;
    }
    public void mostrar(List<Alumno> lista){
        for(Alumno oAlumno : lista){
            oAlumno.mostrar();
        }
    }
}
