package principles.ocp.products.solution;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void mostrar(List<Alumno> lista){
        for(Alumno a: lista){
            a.mostrar();
        }
    }

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
//        Filtrar filtrar = new Filtrar();
//        System.out.println("Filtrar por Carrera: ");
//        List<Alumno> listaPorCarrera = filtrar.
//                porCarrera(listaDeAlumnos, CARRERA.IS);
//        filtrar.mostrar(listaPorCarrera);
//        
//        System.out.println("Filtrar por Semestre: ");
//        List<Alumno> listaPorSemestreActual = filtrar.
//                porSemestre(listaDeAlumnos, SEMESTRE.II);
//        filtrar.mostrar(listaPorSemestreActual);
        
        MejorFiltro mejorFiltro = new MejorFiltro();
        List<Alumno> l1 = mejorFiltro.filtrar(listaDeAlumnos, 
                new EspecificacionCarrera(CARRERA.IS));
        mostrar(l1);
        System.out.println("AND Compuesto");
        EspecificacionCompuesta andEsp = new EspecificacionCompuesta(
                new EspecificacionCarrera(CARRERA.IS),
                new EspecificacionSemestre(SEMESTRE.II)
        );
        List<Alumno> l2 = mejorFiltro.filtrar(listaDeAlumnos, 
                andEsp);
        mostrar(l2);
        
        
    }
}
