package patrones.factorymethod.ejemplo2;

import java.util.Scanner;

public class Client {
    static Scanner entrada = new Scanner(System.in);
    public static void crearBD(Creator_BDManager bdManager){
        Product_BD bd = bdManager.factoryMethod();
        bd.conectar();
    }
    public static int menu(){
        System.out.println("MENU PRINCIPAL");
        System.out.println("1. Crear una BD MySQL");
        System.out.println("2. Crear una BD Oracle");
        System.out.println("3. Salir");
        System.out.print("Elija una Opción: ");
        return entrada.nextInt();       
    }
    public static void main(String[] args) {
        boolean terminado=false;
        do{
            switch (menu()){
                case 1: crearBD(new Creador_MySQL());
                break;
                case 2: crearBD(new Creator_Oracle());
                break;
                case 3: terminado=true;
                break;
            }
            
        } while (!terminado);
    }
    
}
