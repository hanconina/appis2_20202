package principles.lsp.ejemploPajaroProblem;

public class Pinguino extends Pajaro{
    @Override
    public void vuela(){
        new Exception("No puede volar!");
    }
    
}
