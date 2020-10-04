

package patrones.abstractfactory.gestordatabase;

import java.util.Scanner;


public class BDManager {

   private static Scanner opcion = new Scanner(System.in);
   
   public static int Menu(){
        System.out.println("SELECCIONE su DB:\n"
                + "1. SQL \n"
                + "2. XML \n"
                + "Seleccione su opcion: ");
        return Integer.parseInt(opcion.nextLine());
    }
   
   public static void crearDB(FabricaBaseDatos fabrica){
       Conexion conexion = fabrica.getConexion();
       conexion.open();
       conexion.close();
       
       Consulta consulta = fabrica.getConsulta();
       consulta.set("SQL Select");
       consulta.execute();
       
   }
    
    public static void main(String[] args) {
         int o;
      do{
          o=Menu();
          switch(o)
          {      
              case 1: crearDB(new FabricaSQLDB());
              break;
              case 2: crearDB(new FabricaXMLDB());
              default: System.out.println("Opcion invalida");
          }
      }while(o!=3);
    }
    
}
