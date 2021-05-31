package patrones.command.ejemplo1;

public class OrdenCortar implements Orden{

    private Pantalla documento; // Establece un enlace entre el objeto receptor y una accion
    private String estadoAnterior;
    private int inicio, fin;

    public OrdenCortar(Pantalla documento, int inicio, int fin) {
        this.documento = documento;
        this.estadoAnterior = documento.toString();
        this.inicio = inicio;
        this.fin = fin;
    }
    
    
    @Override
    public void execute() {
        documento.cortar(inicio, fin);
    }

    @Override
    public void undo() {
        documento.limpiarPortapapeles();
        documento.setTexto(estadoAnterior);
    }
    
}
