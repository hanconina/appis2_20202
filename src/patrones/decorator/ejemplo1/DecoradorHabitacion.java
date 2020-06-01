package patrones.decorator.ejemplo1;

public abstract class DecoradorHabitacion implements Habitacion{
    
    public Habitacion habitacion; 

    public DecoradorHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
    
    public String mostrarHabitacion(){
        return habitacion.mostrarHabitacion();
    }
    
    
}
