package principles.dip.ejemploCarritoComprasSolution;
public class ServidorArchivos implements IPersistencia{

    @Override
    public void guardar(Compra compra) {
        System.out.println("Guardar en el Servidor de archivos");
    }
    
}
