public class Testando {
    public static void main(String[] args) {

        Cliente c = new Cliente();
        c.setNome("rk");

        Conta cc = new ContaCorrente(c);
        cc.depositar(200);

        cc.informacaoLocal();
    }
}
