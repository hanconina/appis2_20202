package patrones.singleton.ejemplo1;
// Clase debe Singleton
class Capitan {
    // declarar una única instancia de esta clase
    private static Capitan instance;   
    // constructor sea privado
    private Capitan(){}
    // Método para recuperar una única instancia
    public static Capitan getInstance(){
        // Inicilización peresoza
        if (instance==null){
            instance = new Capitan();
            System.out.println("El Equipo eligio un Capitan");
            System.out.println("El capitan va al sorteo");
        }else{
            System.out.println("El equipo ya tiene un capitan");
        }
        return instance;
    }
    
    
}
