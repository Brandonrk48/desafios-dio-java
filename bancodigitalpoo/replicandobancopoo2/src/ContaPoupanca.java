public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void informacaoLocal() {
        System.out.println("=====EXTRATO CONTA POUPANCA=====");
        informacaoGeral();
    }
    
}
