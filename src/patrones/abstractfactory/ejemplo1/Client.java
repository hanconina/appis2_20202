package patrones.abstractfactory.ejemplo1;

import java.util.Scanner;

public class Client {
    private AbstractProduct_Boton boton;
    private AbstractProduct_CajaTexto cajaTexto;
    
    public Client(AbstractFactoryGUI factory){
        boton = factory.crearBoton();
        cajaTexto = factory.crearCajaTexto();
    }
    
    public void dibujar(){
        boton.dibuja();
        cajaTexto.dibujar();
    }
    
    
}
