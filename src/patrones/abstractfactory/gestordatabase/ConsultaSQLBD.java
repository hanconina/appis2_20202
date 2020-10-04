/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.abstractfactory.gestordatabase;

public class ConsultaSQLBD implements Consulta {

    @Override
    public boolean set(String text) {
        System.out.println("SQLDB Cambia Consulta");
        return true;
    }

    @Override
    public boolean execute() {
        System.out.println("SQLDB Ejecuta Consulta");
        return true;
    }

}
