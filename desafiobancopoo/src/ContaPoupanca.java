public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente){
        super(cliente);
        //É necessário o construtor porque na classe Conta, o Cliente é passado no construtor.
    }
    public void imprimirInfoLocal(){
        System.out.println("Conta Pupança.");
        super.imprimirExtrato();
    }
}

