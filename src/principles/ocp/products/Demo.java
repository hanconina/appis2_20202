package principles.ocp.products;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Alumno> listaDeAlumnos = new ArrayList<Alumno>();
        Alumno a1 = new Alumno("Juan", SEMESTRE.II, CARRERA.IS);
        Alumno a2 = new Alumno("Ana", SEMESTRE.III, CARRERA.IS);
        Alumno a3 = new Alumno("Pedro", SEMESTRE.IV, CARRERA.IC);
        Alumno a4 = new Alumno("Juan", SEMESTRE.II, CARRERA.IC);
        listaDeAlumnos.add(a1);
        listaDeAlumnos.add(a2);
        listaDeAlumnos.add(a3);
        listaDeAlumnos.add(a4);
        Filtrar filtrar = new Filtrar();
        System.out.println("Filtrar por Carrera: ");
        List<Alumno> listaPorCarrera = filtrar.
                porCarrera(listaDeAlumnos, CARRERA.IS);
        filtrar.mostrar(listaPorCarrera);
        
        System.out.println("Filtrar por Semestre: ");
        List<Alumno> listaPorSemestreActual = filtrar.
                porSemestre(listaDeAlumnos, SEMESTRE.II);
        filtrar.mostrar(listaPorSemestreActual);
    }
}
