/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.abstractfactory.gestordatabase;

public class ConexionXMLDB implements Conexion {

    @Override
    public boolean open() {
        System.out.println("XMLDB ABRE Conexion");
        return true;
    }

    @Override
    public boolean close() {
        System.out.println("XMLDB CIERRA Conexion");
        return true;
    }

}
