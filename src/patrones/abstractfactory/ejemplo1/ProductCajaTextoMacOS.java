package patrones.abstractfactory.ejemplo1;

public class ProductCajaTextoMacOS implements AbstractProduct_CajaTexto {

    @Override
    public void dibujar() {
        System.out.println("Dibujar una Caja de Texto en MacOS");
    }
    
    
}
