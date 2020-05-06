package patrones.abstractfactory.ejemplo1;

public class ProductCajaTextoWindow implements AbstractProduct_CajaTexto{

    @Override
    public void dibujar() {
        System.out.println("Dibujar Caja de Texto en Windows");
    }
    
    
}
