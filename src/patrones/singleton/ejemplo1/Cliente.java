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
        // Crear una copia de un objeto
        Capitan capitan3;
        capitan3 = capitan1;
        if (capitan1==capitan3){
            System.out.println("Es el mismo capitan1 y capitan3");
        }else{
            System.out.println("Son diferentes");
        }
        // Thread
//        Capitan.CapitanDerivado capitan4 = 
//                capitan1.new CapitanDerivado();
//
//        if (capitan1==capitan4){
//            System.out.println("Es el mismo capitan1 y capitan3");
//        }else{
//            System.out.println("Son diferentes");
//        }
    }
    
}
