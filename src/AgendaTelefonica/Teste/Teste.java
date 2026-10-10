package AgendaTelefonica.Teste;

import AgendaTelefonica.dominio.Numero;
import AgendaTelefonica.servicos.Agendaservicos;

import java.util.Scanner;

public class Teste {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       Agendaservicos ags = new Agendaservicos();
       byte codigo = 0;
       byte op = 0;
       String nomeBuscado;
       String nome;
       String num;
       System.out.println("Deseja entrar na agenda? 1 para sim 0 para não");
       codigo = scan.nextByte();
       scan.nextLine();
       while (codigo!=0){
           System.out.println("Menu de opções");
           System.out.println("1-Cadastrar");
           System.out.println("2-Mostrar a agenda");
           System.out.println("3-Consulta por nome");
           codigo = scan.nextByte();
           scan.nextLine();
           switch (codigo){
               case 1:
                   System.out.println("Informe o nome ");
                   nome = scan.nextLine();
                   System.out.println("Informe o número");
                   num = scan.nextLine();
                   ags.cadastrarContatos(codigo,nome,num);
               break;
               case 2:
                   ags.mostrarContatos(codigo);
                   break;
               case 3:
                   System.out.println("Informe o nome a ser buscado");
                   nomeBuscado =  scan.nextLine();
                   ags.consultaPorNome(nomeBuscado );
           }
           System.out.println("Deseja continuar? 1 para sim 0 para não");
           codigo = scan.nextByte();
       }
       //ags.cadastrarContatos(codigo,nome,num);

    }
}
