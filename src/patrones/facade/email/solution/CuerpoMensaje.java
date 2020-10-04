package patrones.facade.email.solution;

class CuerpoMensaje {
    private DocumentoAdjunto doc;
    private String texto;

    public void CuerpoMensaje(String texto, DocumentoAdjunto doc) {
        this.doc = doc;
        this.texto = texto;
    }

    public DocumentoAdjunto getDoc() {
        return doc;
    }

    public void setDoc(DocumentoAdjunto doc) {
        this.doc = doc;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
}
