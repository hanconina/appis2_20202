package patrones.factorymethod.ejemplo1;

import java.util.Scanner;

public class Client {
    static Scanner entrada = new Scanner(System.in); 
    
    public static void crearDocumento(Aplicacion app){
        Documento doc = app.factoryMethod();
        doc.mostrarDocumento();
    }
    public static int menu(){
        System.out.println("MENU PRINCIPAL");
        System.out.println("1.- Crear un documento de dibujo");
        System.out.println("2.- Crear un documento de texto");
        System.out.println("3.- Salir");
        System.out.print("Elija la opción deseada: ");
        return entrada.nextInt();
    }
    public static void main(String[] args) {
        boolean terminado = false;
        do{
            switch (menu()){
                case 1: crearDocumento(new AplicacionDibujo());
                break;
                case 2: crearDocumento(new AplicacionTexto());
                break;
                case 3: terminado = true;
                break;
            }            
        } while (!terminado);
    }
    
}
