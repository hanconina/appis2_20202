package patrones.abstractfactory.demogui;
// Client
public class Application {
    private Button button;
    private TextField textField;
    
    public Application(GUIFactory factory){
        this.button = factory.createButton();
        this.textField = factory.createTextField();
    }
    
    public void paint(){
        this.button.paint();
        this.textField.paint();
    }    
}
