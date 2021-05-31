package principles.dip.ejemploCarritoComprasSolution;

public class SQLDatabase implements IPersistencia{

    @Override
    public void guardar(Compra compra) {
        System.out.println("Guardar la compra en BD");
    }
    
    
}
