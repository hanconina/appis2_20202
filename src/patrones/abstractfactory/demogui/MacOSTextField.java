package patrones.abstractfactory.demogui;
// Concrete Product B
public class MacOSTextField implements TextField{

    @Override
    public void paint() {
        System.out.println("Tienes creado una caja de texto MacOS");
    }
    
}
