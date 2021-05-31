package principles.dip.ejemploCarritoComprasSolution;
public class TarjetaCredito implements IMetodoPago{

    @Override
    public void pagar(Compra compra) {
        System.out.println("Pagar con tarjeta de credito");
    }
    
    
}
