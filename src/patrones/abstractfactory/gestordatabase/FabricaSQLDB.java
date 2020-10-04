
package patrones.abstractfactory.gestordatabase;

public class FabricaSQLDB implements FabricaBaseDatos{

    @Override
    public Conexion getConexion() {
        return new ConexionSQLDB();
    }

    @Override
    public Consulta getConsulta() {
        return new ConsultaSQLBD();
    }
    
}
