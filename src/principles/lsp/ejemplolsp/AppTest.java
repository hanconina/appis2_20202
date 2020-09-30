
package principles.lsp.ejemplolsp;

/**
 *
 * @author user
 */
public class AppTest {
    // LSP
    // Crear una funcion que se debe cumplir para una propiedad
    public static void phi(Libro o1){
        System.out.println(o1.getMulta());
    }
    public static void main(String[] args) {
        CD o2 = new CD();
        phi(o2); // se cumpla la propiedad del super tipo
    }
    
}
