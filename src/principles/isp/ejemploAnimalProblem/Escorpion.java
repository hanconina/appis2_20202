package principles.isp.ejemploAnimalProblem;

public class Escorpion implements Animal{

    @Override
    public void alimentar() {
        System.out.println("Alimentar al Escorpion!!");        
    }

    @Override
    public void acariciar() {
        new Exception("Pero que haces");
    }
    
}
