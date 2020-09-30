package patrones.abstractfactory.ejemplo1;

public interface AbstractFactoryGUI {
    AbstractProduct_Boton crearBoton();
    AbstractProduct_CajaTexto crearCajaTexto();
    AbstractProduct_RadioBoton crearRadioBoton();
}
