package patrones.decorator.ejemplo1;

public class Color extends DecoradorHabitacion{
    
    public Color(Habitacion habitacion) {
        super(habitacion);
    }
    
    public String mostrarHabitacion(){
        return super.mostrarHabitacion() + agregarColor();
    }
    
    public String agregarColor(){
        return "+ Azul";
    }    
}
