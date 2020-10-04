/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principles.srp.curso.solution;

/**
 *
 * @author user
 */
public class CursoDAO {

    void guardarCursoBD(Curso curso) {
        System.out.println("El curso se guardo en la BD: " + curso.getNombre());
    }

    void eliminarCurso(int codigo) {
        System.out.println("El curso con ID: " + codigo + " fue eliminado de la BD");
    }

}
