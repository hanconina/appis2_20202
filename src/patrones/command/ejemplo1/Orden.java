/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.command.ejemplo1;

// Orden: declara una interfaz para ejecutar una operación
public interface Orden {
    void execute();
    void undo();
}


