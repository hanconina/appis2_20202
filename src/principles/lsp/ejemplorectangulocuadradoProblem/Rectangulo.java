package principles.lsp.ejemplorectangulocuadradoProblem;

/**
 *
 * @author user
 */
public class Rectangulo {
    private int altura;
    private int ancho;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    public int area(){
        return this.altura*this.ancho;
    }
    
}
