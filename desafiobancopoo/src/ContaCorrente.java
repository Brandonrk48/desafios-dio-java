public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        //super: "Sobe lá na superclase e manda esse atributo para ele".
        //É necessário o construtor porque na classe Conta, o Cliente é passado no construtor.
    }
    public void imprimirInfoLocal(){
        System.out.println("Conta Corrente.");
        super.imprimirExtrato();
    }
    
}
