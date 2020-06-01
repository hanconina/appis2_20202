package patrones.command.ejemplo2;


public class AbrirPuerta implements Command{
//Concrete Command
        
        private Puerta puerta;

        public AbrirPuerta(){
                this.puerta = new Puerta();
        }

        public void execute(){

                puerta.conectar();

                puerta.abrir();

                puerta.desconectar();

        }

}