package patrones.abstractfactory.demogui;
// Concrete Product B
public class WindowsTextField implements TextField{

    @Override
    public void paint() {
        System.out.println("Tienes creado una caja de texto windows");
    }
    
}
