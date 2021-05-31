
package patrones.command.ejemplo1;

//ORDEN CONCRETA - COPIAR

public class OrdenCopiar implements Orden{

    private Pantalla documento; // Establece un enlace entre el objeto receptor y una accion
    private String estadoAnterior;
    private int inicio, fin;

    public OrdenCopiar(Pantalla documento, int inicio, int fin) {
        this.documento = documento;
        this.estadoAnterior = documento.toString(); //Al crear la orden, guarda el valor actual de la pantalla
        this.inicio = inicio;
        this.fin = fin;
    }
    
    @Override
    public void execute() {
        documento.copiar(inicio, fin);
    }

    @Override
    public void undo() {
        //No debería hacer nada porque no hay UNDO de copiar
    }
    
}
