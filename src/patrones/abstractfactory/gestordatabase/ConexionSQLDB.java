
package patrones.abstractfactory.gestordatabase;

public class ConexionSQLDB implements Conexion{

    @Override
    public boolean open() {
        System.out.println("SQLDB ABRE Conexion");
        return true;
    }

    @Override
    public boolean close() {
        System.out.println("SQLDB CIERRA Conexion");
        return true;
    }
    
    
}
