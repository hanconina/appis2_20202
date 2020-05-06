package patrones.abstractfactory.ejemplo1;

public class ProductBotonMacOS implements AbstractProduct_Boton{

    @Override
    public void dibuja() {
        System.out.println("Dibujar un Boton MacOS");
    }
    
}
