package cadastrocontas;

/**
 *
 * @author bernardo
 */
public class ContaCorrente {
   private String nome;
   private int numero;
   private double saldo;
   
   public ContaCorrente(String umNome,int umNumero,double saldoInicial){
       nome = umNome;
       numero = umNumero;
       saldo = saldoInicial;
   }
   
   public int getNumero(){
       return(numero);
   }
   
   public double getSaldo(){
       return(saldo);
   }
   
   public String getNome(){
       return(nome);
   }
   
   public void deposito(double valor){
       saldo += valor;
   }
   
   public void retirada(double valor){
       saldo -= valor;
   }
   
   @Override
   public String toString(){
       return(numero+":"+nome+": R$ "+saldo);
   }
}
