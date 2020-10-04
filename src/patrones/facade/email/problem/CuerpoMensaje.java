package patrones.facade.email.problem;

class CuerpoMensaje {
    private DocumentoAdjunto doc;
    private String texto;

    public CuerpoMensaje(String texto, DocumentoAdjunto doc) {
        this.doc = doc;
        this.texto = texto;
    }
    
}
