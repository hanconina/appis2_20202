package patrones.abstractfactory.ejemplo1;

public class ConcreteFactoryMacOS implements AbstractFactoryGUI{

    @Override
    public AbstractProduct_Boton crearBoton() {
        return new ProductBotonMacOS();        
    }

    @Override
    public AbstractProduct_CajaTexto crearCajaTexto() {
        return new ProductCajaTextoMacOS();
    }
    
}
