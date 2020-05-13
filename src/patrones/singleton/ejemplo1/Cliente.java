package patrones.singleton.ejemplo1;

class Cliente {
    public static void main(String[] args) {
        // Error porque el constructor es privado
        //Capitan capitan1 = new Capitan();
        Capitan capitan1 = Capitan.getInstance();
        // Verificar si podemos tener otro capitan
        Capitan capitan2 = Capitan.getInstance();
        if (capitan1==capitan2){
            System.out.println("Es el mismo capitan");
        }else{
            System.out.println("Son diferentes");
        }
    }
    
}
