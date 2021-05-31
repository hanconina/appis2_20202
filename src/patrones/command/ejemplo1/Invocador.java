

package patrones.command.ejemplo1;

//INVOCADOR

import java.util.LinkedList;

// Es quien le pide a la orden que ejecute una petición
// Puede encargarse de gestionar las peticiones y almacenarlas
public class Invocador {
    
    //LinkedList es una versión mejorada del Array list. Me da mejores funciones de add y remove
    private LinkedList historial_comandos = new LinkedList();
    //private LinkedList redoList = new LinkedList();
   
    
    public void ejecutar(Orden orden){
        historial_comandos.add(orden);
        orden.execute();
        
    }
    
    public void deshacerOrden(){
        //Remover el ultimo comando de la lista
        //removeLast() ademas de quitar el elemento, lo devuelve como (Object)
        //Luego de hacer cast, ejecutamos undo()
        if(!this.historial_comandos.isEmpty()){
            ((Orden)this.historial_comandos.removeLast()).undo();
        }
    }
    /*
    public void rehacerOrden(){
        if(!redoList.isEmpty()){
            Orden redoOrden;
            redoOrden = (Orden)redoList.removeLast();
            redoOrden.execute();
            historial_comandos.add(redoOrden);
                       
        }
    }*/
    
}
