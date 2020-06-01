package patrones.decorator.ejemplo1;

public class HotelDecorador {

    public static void main(String[] args) {
        
        Habitacion hab1 = new Color(new HabitacionSimple());
        Habitacion hab2 = new Alfombra(new Color(new TV(new HabitacionSimple())));
        
        System.out.println(hab1.mostrarHabitacion());
        System.out.println(hab2.mostrarHabitacion());
    }
    
}
