package patrones.facade.email.solution;

public class FacadeGestorEmail {
    private CuerpoMensaje cuerpo;
    private Seguridad seguridad;
    private SMTPService smtp;
    private DocumentoAdjunto adjunto;
    private Mensaje mensaje;
    private CabeceraMensaje cabecera;

    public FacadeGestorEmail() {
        this.cuerpo = new CuerpoMensaje();
        this.seguridad = new Seguridad();
        this.smtp = new SMTPService();
        this.adjunto = new DocumentoAdjunto();
        this.mensaje = new Mensaje();
        this.cabecera = new CabeceraMensaje();
    }
    public void enviarMensaje(
            String destinatario,
            String asunto,
            String texto,
            String archivoAdjunto
            ){
        System.out.println("Creando el mensaje");
        cabecera.setPara(destinatario);
        cabecera.setAsunto(asunto);
        adjunto.setArchivo(archivoAdjunto);
        cuerpo.setTexto(texto);
        cuerpo.setDoc(adjunto);
        mensaje.setCabecera(cabecera);
        mensaje.setCuerpo(cuerpo);
        String encriptado = seguridad.Encriptar(mensaje);
        smtp.enviarMail(encriptado);       
        System.out.println("Mensaje enviado");
    }  
        
    
            
}
