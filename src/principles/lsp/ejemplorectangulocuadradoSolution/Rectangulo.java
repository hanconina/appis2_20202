package principles.lsp.ejemplorectangulocuadradoSolution;

public class Rectangulo {
    public final int ancho;
    public final int altura;
    
    public Rectangulo(int ancho, int altura){
        this.altura = altura;
        this.ancho = ancho;
    }

    public int calcularArea() {
        return ancho*altura;
    }
    
}
