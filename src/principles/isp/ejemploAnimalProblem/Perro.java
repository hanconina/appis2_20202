package principles.isp.ejemploAnimalProblem;
public class Perro implements Animal{

    @Override
    public void alimentar() {
        System.out.println("Alimentar al Perro!!");
    }

    @Override
    public void acariciar() {
        System.out.println("Acariciar al Perro!!!");
    }
    
}
