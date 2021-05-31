package principles.dip.ejemploCarritoComprasProblem;
public class CarritoCompras {
    public void comprar(Compra compra){
        SQLDatabase sqlDatabase = new SQLDatabase();
        sqlDatabase.guardar(compra);
        
        TarjetaCredito tarjetaCredito = new TarjetaCredito();
        tarjetaCredito.pagar(compra);
    }
    
}
