package patrones.command.ejemplo2;

public class Puerta{
//Receiver
    
        public boolean conectar(){

                System.out.println("Conectando al sistema de la puerta...");

                try{

                        System.out.println("Conexión al sistema de la puerta establecida.");

                        return true;

                }catch(Exception e){

                        System.out.println("No se ha podido establecer la conexión al sistema de la puerta. ERROR:n"+e.getMessage());

                        return false;

                }

        }

        public boolean desconectar(){

                System.out.println("Desconectando del sistema de la puerta...");

                try{

                        System.out.println("Se ha desconectado del sistema de la puerta.");

                        return true;

                }catch(Exception e){

                        System.out.println("No se ha podido desconectar del sistema de la puerta. ERROR:n"+e.getMessage());

                        return false;

                }

        }

        public boolean abrir(){

                System.out.println("Abriendo la puerta...");

                try{

                        System.out.println("Puerta abierta.");

                        return true;

                }catch(Exception e){

                        System.out.println("No se ha podido abrir la puerta. ERROR:n"+e.getMessage());

                        return false;

                }

        }

        public boolean cerrar(){

                System.out.println("Cerrando la puerta...");

                try{

                        System.out.println("Puerta cerrada.");

                        return true;

                }catch(Exception e){

                        System.out.println("No se ha podido cerrar la puerta. ERROR:n"+e.getMessage());

                        return false;

                }

        }

}