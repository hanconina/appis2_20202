
package patrones.command.ejemplo1;


public class OrdenPegar implements Orden{
    private DocumentoEditor documento;
    private String estadoAnterior;
    private int posicion; //indica a partir de qué posición pegar lo del portapapeles

    public OrdenPegar(DocumentoEditor documento, int posicion) {
        this.documento = documento;
        this.estadoAnterior = documento.toString();
        this.posicion = posicion;
    }
       
    @Override
    public void execute() {
        documento.pegar(posicion);
    }

    @Override
    public void undo() {
        documento.limpiarPortapapeles();
        documento.setTexto(estadoAnterior);
    }
    
}
