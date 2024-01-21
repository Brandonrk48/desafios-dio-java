package funcionalidades.IphoneMult;

import funcionalidades.ligacoes.AparelhoDeLigacoes;
import funcionalidades.internet.NavegadorNaInternet;
import funcionalidades.musica.ReprodutorMusica;

    public class Iphone implements NavegadorNaInternet, AparelhoDeLigacoes, ReprodutorMusica {


        public void tocar() {
            System.out.println("Tocando música pelo Iphone.");
        }

       
        public void pausar() {
            System.out.println("Pausando música pelo Iphone");
        }

       
        public void selecionarMusica() {
            System.out.println("Selecionando música pelo Iphone.");
        }

    
        public void ligar() {
            System.out.println("Ligando pelo Iphone.");
        }

      
        public void atender() {
            System.out.println("Atendendo pelo Iphone.");
        }

      
        public void iniciarCorreioVoz() {
            System.out.println("Iniciando correio de voz pelo Iphone.");
        }

     
        public void exibirPagina() {
            //adicionar lógica de programação

         
        }

        public void atualizarPagina() {
            //adicionar lógica de programação

        }

        public void adicionarNovaAba() {
            //adicionar lógica de programação

          
        }

    }