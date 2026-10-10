package AgendaTelefonica.servicos;

import AgendaTelefonica.dominio.Contato;
import AgendaTelefonica.dominio.Numero;

import java.util.ArrayList;
import java.util.List;

public class Agendaservicos {

    private List<Contato> agenda = new ArrayList<>();

    private final int limite = 5;

    public Contato criarObjetoContatos(byte codigo){
        if (codigo<0 || codigo>3){
            throw new RuntimeException("Maior que 3 ou menor que 0");
        }
        return new Contato();
    }

    public void cadastrarContatos(byte codigo, String nome, String num){
        if (codigo!=1){
            throw new RuntimeException("Não é um(1)");
        }
        if (agenda.size()>=5){
            throw new ArrayIndexOutOfBoundsException("Fora do limite de 5");
        }
        Numero nume = new Numero(num);
        Contato contato = criarObjetoContatos(codigo);
        contato.cadastrarContato(nome,nume);
        agenda.add(contato);
    }
    public void mostrarContatos(byte codigo){
       /* Contato contato = criarObjetoContatos(codigo);

        contato.mostrarContatos(contato);
        */
        if (agenda.isEmpty()){
            System.out.println("Agenda está vazia");
            return;
        }
        agenda.forEach(c -> c.mostrarContatos());
    }

    public void consultaPorNome(String nomeBuscado){
        for (Contato c : agenda){
            if (c!=null && c.verificarNome(nomeBuscado)){
                System.out.println("Encontrado: ");
                c.mostrarContatos();
                return;
            }
            System.out.println("Contato não encontrado");
        }
    }
}
