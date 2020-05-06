package patrones.factorymethod.ejemplo1;

// Dentro de la estructuctura del patrón factory serían
// Clases ConcreteCreator - Clases concretas del Creador
// Creador - Aplicacion
// Clase concreta - AplicacionDibujo
public class AplicacionDibujo extends Aplicacion {

    @Override
    public Documento factoryMethod() {
        return new DocumentoDibujo();                
    }
    
}
