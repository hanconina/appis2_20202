package patrones.factorymethod.ejemplo1;
// Dentro de la estructura del patron representa al Creador de un Producto
// Creator
public abstract class Aplicacion {
    // Método abstracto factory method
    // Crear un objeto del tipo producto (Documento)
    public abstract Documento factoryMethod();
}
