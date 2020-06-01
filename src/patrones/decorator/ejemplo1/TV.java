package patrones.decorator.ejemplo1;


public class TV extends DecoradorHabitacion{
    
    public TV(Habitacion habitacion) {
        super(habitacion);
    }
    
    public String mostrarHabitacion(){
        return super.mostrarHabitacion() + agregarTV();
    }
    
    public String agregarTV(){
        return "+ TV";
    }    
}
