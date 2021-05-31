package patrones.abstractfactory.demogui;
public class DemoGUI {
    public static Application configureApplication(){
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("macos")){
            factory = new MacOSFactory();
            app = new Application(factory);
        }else{
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }
    public static void main(String[] args){
        Application app = configureApplication();
        app.paint();
    }
    
}
