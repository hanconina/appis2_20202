/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principles.ocp.products.solution;

/**
 *
 * @author user
 */
public class EspecificacionCarrera implements EspecificacionSimple{
    
    private CARRERA carrera;

    public EspecificacionCarrera(CARRERA carrera) {
        this.carrera = carrera;
    }
    
    @Override
    public boolean esValido(Alumno item) {        
        return item.carrera == carrera;
    }    
}
