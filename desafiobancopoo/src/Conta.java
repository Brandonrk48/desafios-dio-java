
public abstract class Conta implements IConta{
//classe abstrata, para que so que à estender cosiga acessar seus metodos e atributos

    protected double saldo = 50;
    //já inicia com um valor para fazer o teste de tranferencia
    private Cliente cliente;
    protected int agencia;
    protected int numero;
    //criar os métodos gets dos atributos, menos do cliente

    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 1; 

    public Conta(Cliente cliente){
        this.cliente = cliente;
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL ++;//toda vez que for criado um objeto do tipo conta, o SEQUENCIAL ira incrementar
        //Para ter uma conta adastrada no banco, obrigatoriamente é preciso de um cliente
        //aqui estou passando um cliente no construtor
        //O this é usado em atributos da própria classe, diferentemente do super.
    }

    @Override
    public void sacar(double valor) {
       saldo -= valor;
    }
    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
    }
    @Override
    public void imprimirExtrato() {
        System.out.println("====Extrato bancário====");
        System.out.println("TITULAR: " + this.cliente.getNome());
        System.out.println(String.format("AGENCIA %d: ", this.agencia));
        System.out.println(String.format("CONTA %d", this.numero));
        System.out.println(String.format("SALDO %.2f", this.saldo));
        
    }
    @Override
    public void imprimirInfoLocal() {

    }



    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }
    
    
}
