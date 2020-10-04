package patrones.facade.email.solution;

public class Mensaje {
    private CabeceraMensaje cabecera;
    private CuerpoMensaje cuerpo;

    public void Mensaje(CabeceraMensaje cabecera, CuerpoMensaje cuerpo) {
        this.cabecera = cabecera;
        this.cuerpo = cuerpo;
    }

    public CabeceraMensaje getCabecera() {
        return cabecera;
    }

    public void setCabecera(CabeceraMensaje cabecera) {
        this.cabecera = cabecera;
    }

    public CuerpoMensaje getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(CuerpoMensaje cuerpo) {
        this.cuerpo = cuerpo;
    }
    
}
