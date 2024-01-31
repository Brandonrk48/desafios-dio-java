import java.util.Scanner;

public class InteracaoCliente {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        int opcao;

        Cliente clienteDois = new Cliente();
        clienteDois.setNome("joão");
        Conta contaJoao = new ContaCorrente(clienteDois);
        //cliente e conta para simular transferencia

        Cliente clienteUm = new Cliente();

        System.out.println("Informe o nome do novo titular: ");
        clienteUm.setNome(dados.next());

        Conta conta = null;

        System.out.println("Digite 1 para criar conta corrente\nDigite 2 para criar conta poupanca");
        int c = dados.nextInt();

        if(c == 1){
            conta = new ContaCorrente(clienteUm);
        } else if(c == 2){
            conta = new ContaPoupanca(clienteUm);
        }
        
        //por aqui vai o do
        System.out.println("1 - Depositar\n2 - Sacar\n3 - Transferir\n OBS: Digite apenas o número:");
        opcao = dados.nextInt();

        switch (opcao) {
            case 1:
            System.out.println("Informe o valor de deposito: ");
            conta.depositar(dados.nextDouble());
            //passando direto o valor de deposito no metodo

            conta.imprimirInfoLocal();

            //mostras extrato12
                break;
            case 2:
            System.out.println("Informe o valor de saque:");
            double valorSaque = dados.nextDouble();
                if( valorSaque > conta.saldo){
                    System.out.println("Saldo indiponpivel.\nVocê tem " + conta.saldo + "disponível para saque.");
                } else {
                    conta.sacar(valorSaque);
                    conta.imprimirInfoLocal();
                }
                break;
             
            case 3:
            System.out.println("Informe o valor de tranferência:");
            valorSaque = dados.nextDouble();
                conta.transferir(valorSaque, contaJoao);
                contaJoao.imprimirInfoLocal();
                break;    
        
            default:
                break;
        }   

    }
}
