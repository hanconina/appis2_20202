package patrones.abstractfactory.ejemplo1;

public class ProductBotonWindows implements AbstractProduct_Boton{

    @Override
    public void dibuja() {
        System.out.println("Dibujar un boton Windows");        
    }
        
}
