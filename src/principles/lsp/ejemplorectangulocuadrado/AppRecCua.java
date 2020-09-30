
package principles.lsp.ejemplorectangulocuadrado;

/**
 *
 * @author user
 */
public class AppRecCua {
    public static void phi(Rectangulo r, int ancho){
        r.setAncho(ancho); // Llama al método cambiar altura del rectangulo
    }
    public static void main(String[] args) {
        Cuadrado c = new Cuadrado();
        c.setAncho(10); // Cambia la altura tambien
        c.setAltura(20); // cambia la altura y el ancho
        
        phi(c,30); // Debería lanzar un error porque
                    // la altura no debería cambiar
                    // Viola el principio de LSP
        System.out.println("Ancho: "+c.getAncho()+ "\n"+
                "Altura: "+c.getAltura());
    }
    
}
