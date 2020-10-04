package patrones.facade.email.problem;

class SMTPService {

    void enviarMail(String mensajeEncriptado) {
        System.out.println("Mensaje Enviado: "+mensajeEncriptado);
    }    
}
