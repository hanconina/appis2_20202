package patrones.facade.email.problem;

public class Mensaje {
    private CabeceraMensaje cabecera;
    private CuerpoMensaje cuerpo;

    public Mensaje(CabeceraMensaje cabecera, CuerpoMensaje cuerpo) {
        this.cabecera = cabecera;
        this.cuerpo = cuerpo;
    }
    
}
