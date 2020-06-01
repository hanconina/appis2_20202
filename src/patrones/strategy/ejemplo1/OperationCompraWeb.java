
package patrones.strategy.ejemplo1;

public class OperationCompraWeb implements Strategy {
  
    static float comision = (float) 0.02;
    
    @Override
    public float doOperation(int num1, float num2) {
        return num1*(1-num2) - num1*comision;
   }
}
