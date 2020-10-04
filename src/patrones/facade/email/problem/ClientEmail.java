package patrones.facade.email.problem;

public class ClientEmail {
    
    public static void main(String[] args) {
        CabeceraMensaje cabecera = 
                new CabeceraMensaje("hninaha@ulima.edu.pe","Examen");
        DocumentoAdjunto doc = new DocumentoAdjunto("examen.docx");
        CuerpoMensaje cuerpo = new CuerpoMensaje("Urgente desarrollo",doc);
        Mensaje mensaje = new Mensaje(cabecera, cuerpo);
        Seguridad sec = new Seguridad();
        String msgEnciptado = sec.Encriptar(mensaje);
        SMTPService smtp = new SMTPService();
        smtp.enviarMail(msgEnciptado);        
    }
 
    
}   
