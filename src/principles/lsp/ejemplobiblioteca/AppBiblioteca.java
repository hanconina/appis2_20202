package principles.lsp.ejemplobiblioteca;

/**
 *
 * @author user
 */
public class AppBiblioteca {

    public static void mostrarMulta(Libro o1) {
        System.out.println("Multa: " + o1.getMulta());
    }

    public static void main(String[] args) {
        CD o2 = new CD();
        // Mostrar Multa de CD
        mostrarMulta(o2);
    }

}
