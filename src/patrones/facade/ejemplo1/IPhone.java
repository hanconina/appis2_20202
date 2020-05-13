package patrones.facade.ejemplo1;

public class IPhone implements Movil{

    @Override
    public void modelo() {
       System.out.println("IPhone 6");
    }

    @Override
    public void precio() {
        System.out.println("1000");
    }
    
    
}
