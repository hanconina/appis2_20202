/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.abstractfactory.gestordatabase;


public class ConsultaXMLDB implements Consulta{

    @Override
    public boolean set(String text) {
        System.out.println("XMLDB Cambia Consulta");
        return true;
    }

    @Override
    public boolean execute() {
        System.out.println("XMLDB Ejecuta Consulta");
        return true;
    }

    
}
