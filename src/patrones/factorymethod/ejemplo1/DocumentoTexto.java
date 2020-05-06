package patrones.factorymethod.ejemplo1;

// Clase concreta de Product

public class DocumentoTexto extends Documento{

    // Implementación del método abstracto de la superclase
    @Override
    public void mostrarDocumento() {
        System.out.println("Mostrar documento de texto");
    }
    
}
