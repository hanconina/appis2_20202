package patrones.abstractfactory.gestordatabase;

public interface FabricaBaseDatos {
    Conexion getConexion();
    Consulta getConsulta();
}
