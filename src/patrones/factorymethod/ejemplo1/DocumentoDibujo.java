package patrones.factorymethod.ejemplo1;

// Dentro de la estructura del patrón está clase representa
// a un Producto Concreto (ConcretePorduct)
public class DocumentoDibujo extends Documento {

    @Override
    public void mostrarDocumento() {
        System.out.println("Mostrar documento de Dibujo");
    }
    
}
