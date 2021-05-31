package patrones.abstractfactory.demogui;
// Concrete Factory for Widnows
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextField createTextField() {
        return new WindowsTextField();
    }
    
}
