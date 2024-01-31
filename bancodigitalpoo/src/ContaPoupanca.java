
public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    /*
      No contrustor da classe Conta, o cliente à compoe
      A classe ContaPupanca extende a classe Conta, e por conta disso, 
      ela obriga as classes filhas a passar como parametro o cliente em seu contrutor.
    */    
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("==== Extrato Conta Poupanca ====");
        super.imprimirInfosComuns();
    }

}