package patrones.command.ejemplo2;


public class ApagarLuces implements Command{

        

        private Luces luces;



        public ApagarLuces(){

                this.luces = new Luces();

        }



        public void execute(){

                luces.conectar();

                luces.apagar();

                luces.desconectar();

        }

}

