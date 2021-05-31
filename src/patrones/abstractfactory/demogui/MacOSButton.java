package patrones.abstractfactory.demogui;
// Concrete Product A
public class MacOSButton implements Button{

    @Override
    public void paint() {
        System.out.println("Tienes creado un boton MacOS");
    }
    
        
}
