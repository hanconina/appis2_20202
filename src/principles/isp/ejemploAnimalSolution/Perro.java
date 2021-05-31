package principles.isp.ejemploAnimalSolution;

public class Perro implements Animal, IMascota{

    @Override
    public void alimentar() {
        System.out.println("Alimentar al Perro");
    }

    @Override
    public void acariciar() {
        System.out.println("Acariciar al perro");
    }
    
    
}
