package padroescomportamentais.visitor;

public class Gerente implements Pessoa{

    private int id;
    private String nome;
    private String setor;

    public Gerente(int id, String nome, String setor) {
        this.id = id;
        this.nome = nome;
        this.setor = setor;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSetor() {
        return setor;
    }

    @Override
    public String permitir(Visitor visitor) {
        return visitor.exibirGerente(this);
    }
}
