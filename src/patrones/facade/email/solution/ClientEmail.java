package patrones.facade.email.solution;

public class ClientEmail {
   
    public static void main(String[] args) {
        FacadeGestorEmail gestorMails = new FacadeGestorEmail();
        gestorMails.enviarMensaje("hninaha@ulima.edu.pe",
                "Examen", "Urgente desarrollo", "examen.docx");
    }
}   
