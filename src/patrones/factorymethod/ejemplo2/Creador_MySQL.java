package patrones.factorymethod.ejemplo2;

public class Creador_MySQL implements Creator_BDManager{

    @Override
    public Product_BD factoryMethod() {
        return new Product_MySQL();        
    }   
}
