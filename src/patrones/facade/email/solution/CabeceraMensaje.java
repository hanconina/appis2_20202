package patrones.facade.email.solution;

class CabeceraMensaje {
    private String para;
    private String asunto;    

    public void CabeceraMensaje(String para, String asunto) {
        this.para = para;
        this.asunto = asunto;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
    
    
}
