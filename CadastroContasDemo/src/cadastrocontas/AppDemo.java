package cadastrocontas;

/**
 *
 * @author bernardo
 */
public class AppDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadContas cad = new CadContas();
        ContaCorrente c1 = new ContaCorrente("Ze das couves2",1000,500.0);
        cad.novaConta(c1);
        cad.novaConta(new ContaCorrente("Luiza",1001,1000.0));
        cad.novaConta(new ContaCorrente("Sergio",1002,2000.0));
        //cad.remove(1001);
        double saldoTotal = cad.getSaldoTotal();
        System.out.println(saldoTotal);        
    }
}
