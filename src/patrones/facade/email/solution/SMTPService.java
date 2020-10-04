package patrones.facade.email.solution;

class SMTPService {

    void enviarMail(String mensajeEncriptado) {
        System.out.println("Mensaje Enviado: "+mensajeEncriptado);
    }    
}
