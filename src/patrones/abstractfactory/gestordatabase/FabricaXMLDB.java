/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.abstractfactory.gestordatabase;


public class FabricaXMLDB implements FabricaBaseDatos{

    @Override
    public Conexion getConexion() {
        return new ConexionXMLDB();
    }

    @Override
    public Consulta getConsulta() {
        return new ConsultaXMLDB();
    }
    
}
