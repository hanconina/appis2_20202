package unittest;

/**
 *
 * @author hernan
 */
public class Cuenta {
    private int numero;
    private float saldo;
    private String titular;
    public Cuenta(){
        numero=0;
        saldo=0.0f;
        titular="";        
    }
    public Cuenta(int pNumero, float pSaldo, String pTitular){
        numero=pNumero;
        saldo=pSaldo;
        titular = pTitular;
    }
    public void depositar(float deposito){
        saldo += deposito;
    }
    public void retirar(float retiro){
        if (retiro<=saldo){
            saldo -= retiro;
        }        
    }
}
