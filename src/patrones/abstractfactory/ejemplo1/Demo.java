package patrones.abstractfactory.ejemplo1;

import java.util.Scanner;

public class Demo {

    static Scanner entrada = new Scanner(System.in);

    public static void crearGUI(AbstractFactoryGUI factory) {
        AbstractProduct_Boton boton = factory.crearBoton();
        boton.dibuja();
        AbstractProduct_CajaTexto cajaTexto = factory.crearCajaTexto();
        cajaTexto.dibujar();
    }

    public static int menu() {
        System.out.println("MENU PRINCIPAL");
        System.out.println("1.- Crear GUI MacOS");
        System.out.println("2.- Crear GUI WIndows");
        System.out.println("3.- Salir");
        System.out.print("Elija su Opcion: ");
        return entrada.nextInt();
    }

    public static void main(String[] args) {
        boolean terminado = false;
        do {
            switch (menu()) {
                case 1:
                    crearGUI(new ConcreteFactoryMacOS());
                    break;
                case 2:
                    crearGUI(new ConcreteFactoryWindows());
                    break;
                default:
                    terminado = true;
                    break;
            }

        } while (!terminado);
    }

}
