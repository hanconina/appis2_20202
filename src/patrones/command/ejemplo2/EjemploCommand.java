package patrones.command.ejemplo2;

import java.io.Console;

public class EjemploCommand {

    /*
        Se desea simular el funcionamiento de una casa inteligente con una serie de comandos que ejecutarán 
        tareas secuenciales, para el control de puertas y luces.
    */
    
    public static void main(String[] args) {
        
        Command command = null;

        //String comm = "EncenderLuces";
        //String comm = "ApagarLuces";
        String comm = "AbrirPuerta";
        //String comm = "CerrarPuerta";
        
        if(comm.equals("EncenderLuces") ){

                command = new EncenderLuces();

        } else if(comm.equals("ApagarLuces")){

                command = new ApagarLuces();

        } else if(comm.equals("AbrirPuerta")){

                command = new AbrirPuerta();

        } else if(comm.equals("CerrarPuerta")){

                command = new CerrarPuerta();
        }

        Invoker invoker = new Invoker(command);

        invoker.run();
    }
    
}
