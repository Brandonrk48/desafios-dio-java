public abstract class Conta implements IConta{

    protected int agencia;
    protected int numero;
    protected double saldo = 0;
    private Cliente cliente;

    private static final int NUMERO_AGENCIA = 0001;
    private static int NUMERO_CONTA = 1;


    public Conta(Cliente cliente){
        this.cliente = cliente;
        this.agencia = NUMERO_AGENCIA;
        this.numero = NUMERO_CONTA ++;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }



    @Override
    public void sacar(double valor) {
        saldo -= valor;
        //mesma coisa que: saldo = saldo - valor;
    }

    @Override
    public void depositar(double valor) {
       saldo += valor;
       //mesma coisa que: saldo = saldo + valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void informacaoGeral() {
        System.out.println(String.format("AGENICA: %d", this.agencia));
        System.out.println(String.format("CONTA: %d", this.numero));
        System.out.println(String.format("SALDO: %.2f", this.saldo));
    }
    
}
