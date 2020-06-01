
package patrones.strategy.ejemplo1;


public class EjemploStrategy {

    static int monto;
    static float descuentoWeb;
    static float descuentoPresencial;
    
    public static void main(String[] args) {
        
        /*
        Se desea calcular el margen de ganancia de una tienda, por cada venta realizada, considerando que:
         - Se aplica un descuento diferenciado si la compra se realiza de forma presencial o vía web.
         - La tienda debe pagar a Visa una comisión, por el pago con tarjeta.
        */
                
        monto = 100;
        descuentoWeb = (float) 0.2;
        descuentoPresencial = (float) 0.1;
        
        Context context = new Context(new OperationCompraWeb());		
        System.out.println("Margen web: " + context.executeStrategy(monto, descuentoWeb));

        context = new Context(new OperationCompraPresencial());		
        System.out.println("Margen presencial: " + context.executeStrategy(monto, descuentoPresencial));
    }
    
}
