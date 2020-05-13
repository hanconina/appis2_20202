package patrones.facade.ejemplo1;

public class Huawei implements Movil{

    @Override
    public void modelo() {
       System.out.println("Huawei Smart 9");
    }

    @Override
    public void precio() {
        System.out.println("1800");
    }
    
    
}
