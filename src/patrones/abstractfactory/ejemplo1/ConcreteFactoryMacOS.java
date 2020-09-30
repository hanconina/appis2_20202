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

    @Override
    public AbstractProduct_RadioBoton crearRadioBoton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
