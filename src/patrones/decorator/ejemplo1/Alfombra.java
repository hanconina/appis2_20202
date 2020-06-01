package patrones.decorator.ejemplo1;

public class Alfombra extends DecoradorHabitacion{
    
    public Alfombra(Habitacion habitacion) {
        super(habitacion);
    }
    
    public String mostrarHabitacion(){
        return super.mostrarHabitacion() + agregarAlfombra();
    }
    
    public String agregarAlfombra(){
        return "+ Alfombrado";
    }    
}
