public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void informacaoLocal() {
        System.out.println("=====EXTRATO CONTA CORRENTE=====");
        informacaoGeral();
    }

    
}
