
package patrones.strategy.ejemplo1;

public class Context {
    
   private Strategy strategy;

   public Context(Strategy strategy){
      this.strategy = strategy;
   }

    public float executeStrategy(int monto, float descuento) {
        return strategy.doOperation(monto, descuento);
    }
    
}
