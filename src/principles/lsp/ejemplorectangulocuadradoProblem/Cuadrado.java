package principles.lsp.ejemplorectangulocuadradoProblem;

/**
 *
 * @author user
 */
public class Cuadrado extends Rectangulo{

    @Override
    public void setAncho(int ancho) {
        super.setAncho(ancho); //To change body of generated methods, choose Tools | Templates.
        super.setAltura(ancho);
    }

    @Override
    public void setAltura(int altura) {
        super.setAncho(altura); //To change body of generated methods, choose Tools | Templates.
        super.setAltura(altura);
    }
}
