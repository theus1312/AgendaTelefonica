package AgendaTelefonica.dominio;

public class Contato {

    private String nome;

    private Numero numero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Numero getNumero() {
        return numero;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    public void cadastrarContato(String nome, Numero num){
        this.nome = nome;
        this.numero = num;
        System.out.println("Contato cadastrado, Nome: "+this.nome+" Número: " + this.numero);
    }
    public void mostrarContatos(){
        String s = (numero!= null ) ? numero.getNum() : "Sem número";
        System.out.println(nome + s);
    }
    public boolean verificarNome(String nomeBuscado){
        return this.nome.equalsIgnoreCase(nomeBuscado);
    }
}
