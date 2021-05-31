package principles.lsp.ejemploPajaroProblem;

public class AppPrueba { // Program P

    public static void vuelaComoPajaro(Pajaro pajaro) {
        pajaro.vuela();
    }

    public static void main(String[] args) {
        Loro loro = new Loro();
        vuelaComoPajaro(loro);
        Pinguino pinguino = new Pinguino();
        try {
            vuelaComoPajaro(pinguino);
        } catch (Exception ex) {
            System.out.println("Exception: "+ex.getMessage());
        }
    }
}
