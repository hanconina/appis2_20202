package patrones.facade.ejemplo1;

import java.util.Scanner;

public class Cliente {
    private static Scanner entrada = new Scanner(System.in);
    public static int menu(){
        System.out.println("VENTA DE MOVILES");
        System.out.println("1) Iphone");
        System.out.println("2) Galaxy");
        System.out.println("3) Huawei");
        System.out.println("4) Salir");
        System.out.print("Elija una opción: ");
        return entrada.nextInt();
    }
    public static void main(String[] args) {
        // Comunicar la aplicacion cliente con la clase
        // Facade
        MovilFacade ventaMoviles = new MovilFacade();
        boolean terminado=false;
        do{
            switch(menu()){
                case 1: ventaMoviles.venderIPhone();break;
                case 2: ventaMoviles.venderGalaxy();break;
                case 3: ventaMoviles.venderHuawei();break;
                case 4: terminado=true;break;
            }
        }while (!terminado);
    }
    
}
