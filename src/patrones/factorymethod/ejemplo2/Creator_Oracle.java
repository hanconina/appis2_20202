package patrones.factorymethod.ejemplo2;

public class Creator_Oracle implements Creator_BDManager{

    @Override
    public Product_BD factoryMethod() {
        return new Product_Oracle();
    }
    
    
}
