
public abstract class Conta implements IConta {
/*
* Ao deixar a classe Contas abstrata, ninguém irá conseguir
* isntanciá-la(ela n pode ser instanciada), a não ser pelas classes que estão extendendo ela.
* Deve ser possível instanciar a ContaCorrente ou ContaPoupanca, e elas extendem a classe Contas.

* A classe Contas implementa a intereface IConta, e a classe Contas e uma superclasse em relação 
* às classes ContaCorrente e ContaPoupanca.
*/

    protected int agencia;
    protected int numero;
    protected double saldo = 0;
    private Cliente cliente;
    //A conta deve ser de um cliente / o lciente compoe a conta
    /*
     * Variável ou classe com visibilidade protected, tem relação direta com herança.
     * Os filhos tem acesso às informações protegidas.
     */

    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente) {
        //toda conta precisa de um cliente para ser criada
        //nesse construtor, já é passado um cliente.
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL ++;
        this.cliente = cliente;
        //Esse é o construtor da conta
    }


    @Override
    public void sacar(double valor) {
        saldo -= valor;
        //Mesma coisa que: saldo = saldo - valor
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        //Mesma coisa que: saldo = saldo + valor
    }

    @Override
    public void tranferir(double valor, Conta contaDestino) {
        /*
          esse metodo espera como parametro uma conta, e dessa forma, ele tera acesso 
          às contas que extendem de Contas
        */
        //A tranferência é o saque em uma conta e o deposito em outra
        this.sacar(valor);
        //Sancando o valor de uma conta
        contaDestino.depositar(valor); 
        //Depositando na conta destino, o valor sacado da conta de origem.   
    }

    @Override
    public void imprimirInfosComuns() {
        System.out.printf("Agencia: %d" , this.agencia);
        System.out.println(" ");
        System.out.printf("Numero: %d", this.numero);
        System.out.println(" ");
        System.out.printf("Saldo: %.2f ", this.saldo);
        System.out.println(" ");

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

}

/*
protcted void imprimirInfosComuns() {
    System.out.println(String.format("Agencia: %d" , this.agencia));
    System.out.println(String.format("numero: %d" , this.numero));
    System.out.println(String.format("Saldo: %.2f" , this.saldo));
}
 */

 /*
  
  */


