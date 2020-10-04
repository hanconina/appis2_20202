package principles.ocp.products.solution;

public class Alumno {
    private String nombres;
    public SEMESTRE semestreActual; 
    public CARRERA carrera;

    public Alumno(String nombres, SEMESTRE semestreActual, CARRERA carrera) {
        this.nombres = nombres;
        this.semestreActual = semestreActual;
        this.carrera = carrera;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    public void mostrar(){
        System.out.println("Nombres: "+nombres);
        System.out.println("Carrera: "+carrera);
        System.out.println("Semestre: "+semestreActual);
    }
    
    
}
