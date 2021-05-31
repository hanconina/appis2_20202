package principles.dip.ejemploCarritoComprasSolution;
public class PayPal implements IMetodoPago{

    @Override
    public void pagar(Compra compra) {
        System.out.println("Pagar con PayPal");
    }
    
    
}
