
package patrones.factorymethod.ejemplo1;

// Clase concreta de Aplicacion

public class AplicacionTexto extends Aplicacion{

    @Override
    public Documento factoryMethod() {
        return new DocumentoTexto();        
    }
    
}
