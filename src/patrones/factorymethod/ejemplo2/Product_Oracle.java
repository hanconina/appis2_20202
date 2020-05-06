package patrones.factorymethod.ejemplo2;

public class Product_Oracle implements Product_BD{

    @Override
    public void conectar() {
        System.out.println("Conectado a ORACLE.");
    }
    
}
