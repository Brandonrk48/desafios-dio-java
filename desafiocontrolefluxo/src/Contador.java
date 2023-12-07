import java.util.Scanner;

public class Contador {

		public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = terminal.nextInt();
			
			try {
				contar(parametroUm, parametroDois);
				//chamando o método contendo a lógica de contagem
			
			}catch (ParametrosInvalidosException e) {
				System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
				//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			}
			
		}

		static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
			int contagem = parametroDois - parametroUm;
			if(parametroUm > parametroDois)
				throw new ParametrosInvalidosException();
			//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
			
			for(int inicioContagem =1; inicioContagem <= contagem; inicioContagem ++){
				System.out.println("Imprimindo valor " + inicioContagem);
			}
			//realizar o for para imprimir os números com base na variável contagem
		}
}


