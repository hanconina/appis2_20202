package patrones.abstractfactory.ejemplo1;

public class ConcreteFactoryWindows implements AbstractFactoryGUI{

    @Override
    public AbstractProduct_Boton crearBoton() {
        return new ProductBotonWindows();
    }

    @Override
    public AbstractProduct_CajaTexto crearCajaTexto() {
        return new ProductCajaTextoWindow();
    }
    
}
