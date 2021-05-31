package patrones.abstractfactory.demogui;
// Concrete Product A
public class WindowsButton implements Button{

    @Override
    public void paint() {
        System.out.println("Tienes creado un Boton Windows");
    }
    
}
