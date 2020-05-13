package patrones.facade.ejemplo1;

public class Galaxy implements Movil{

    @Override
    public void modelo() {
       System.out.println("Galaxy J11");
    }

    @Override
    public void precio() {
        System.out.println("800");
    }
    
    
}
