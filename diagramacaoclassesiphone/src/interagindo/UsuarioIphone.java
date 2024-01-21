package interagindo;

import java.util.Scanner;
import funcionalidades.IphoneMult.Iphone;
import funcionalidades.internet.Chrome;
import funcionalidades.internet.Safarii;

public class UsuarioIphone {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        
        int funcao;
        int continuar = 1;

        Iphone iphone = new Iphone();

        do{
            System.out.println("Digite o número das funcionalidades que você quer acessar:");
            System.out.println("1 - Funções de internet;\n2 - Funções de música;\n3 - Funções de ligações;");
            funcao = dados.nextInt();

            switch (funcao) {
                case 1:
                    String acesso = "?";
                    System.out.println("Quer realizar as funções na internet por meio so Safari ou Chrome?");
                    acesso = dados.next();

                    if(acesso.equals("Chrome") || acesso.equals("chrome")){
                        Chrome c = new Chrome();

                        c.atualizarPagina();
                        c.adicionarNovaAba();
                        c.exibirPagina();
                    } else if(acesso.equals("Safari") || acesso.equals("safari")){
                        Safarii s = new Safarii();

                        s.atualizarPagina();
                        s.adicionarNovaAba();
                        s.exibirPagina();
                    }
                    break;
            
                case 2:
                    iphone.selecionarMusica();
                    iphone.tocar();
                    iphone.pausar();

                    break;

                case 3:
                    iphone.ligar();
                    iphone.atender();
                    iphone.iniciarCorreioVoz();

                    break;
                        default:
                            break;
            }

            System.out.println("");
            System.out.println("Digite 1 para mexer novamente;\nDigite 2 para parar;");
            continuar = dados.nextInt(); 
        }while(continuar==1);
    }
}

/*
 * no if, expor três escolhas, ligacoes, musica e aparelhoDeLigacao e a partir disso, eu crio os objetos
 */