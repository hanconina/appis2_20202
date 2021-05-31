package principles.dip.ejemploCarritoComprasSolution;
public class CarritoCompras {
    private final IPersistencia persistencia;
    private final IMetodoPago metodoPago;
    public CarritoCompras(IPersistencia persistencia,
            IMetodoPago metodoPago){
        this.persistencia = persistencia;
        this.metodoPago = metodoPago;
    }
    public void comprar(Compra compra){
        persistencia.guardar(compra);
        metodoPago.pagar(compra);
    }
    
}
