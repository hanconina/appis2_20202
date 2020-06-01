package patrones.command.ejemplo2;


public class CerrarPuerta implements Command{
//Concrete Command
        

        private Puerta puerta;



        public CerrarPuerta(){

                this.puerta = new Puerta();

        }



        public void execute(){

                puerta.conectar();

                puerta.cerrar();

                puerta.desconectar();

        }

}

