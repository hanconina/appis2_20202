
package patrones.strategy.ejemplo1;

import static patrones.strategy.ejemplo1.OperationCompraWeb.comision;

public class OperationCompraPresencial implements Strategy {
   
    static float comision = (float) 0.07;
    
    @Override
    public float doOperation(int num1, float num2) {
      return num1*(1-num2) - num1*comision;
   }
    
}
