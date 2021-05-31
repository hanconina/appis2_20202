
package principles.lsp.ejemplorectangulocuadradoProblem;

/**
 *
 * @author user
 */
public class AppRecCua {
    public static void mostrarArea(Rectangulo fig){
        System.out.println("Area: "+fig.area());
    }
    public static void main(String[] args) {
        Rectangulo fig1 = new Rectangulo();
        fig1.setAltura(8);
        fig1.setAncho(5);
        mostrarArea(fig1);
    }
    
}
