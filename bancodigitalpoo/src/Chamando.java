public class Chamando {
    public static void main(String[] args) {

        Cliente c = new Cliente();
        c.setNome("rk");

        Conta cc = new ContaCorrente(c);
        cc.depositar(120);
        //crindo conta corrente para o rk.

        //O contrutor de Contas já gera automaticamente a agência e o número

        Conta poupanca = new ContaPoupanca(c);
        cc.tranferir(20, poupanca);
        //crindo conta poupança para o rk.

        //primeiro ele saca o valor de quem chamou o metodo, que nesse caso foi o cc
        //e posteriormente ele deposita na conta destino, que neste caso, é a conta poupanca 


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();


    }
    
}
