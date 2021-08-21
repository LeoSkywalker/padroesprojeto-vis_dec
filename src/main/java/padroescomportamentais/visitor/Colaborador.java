package padroescomportamentais.visitor;

public class Colaborador implements Pessoa{

    private int id;
    private String cpf;
    private String cargo;

    public Colaborador(int id, String cpf, String cargo) {
        this.id = id;
        this.cpf = cpf;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String permitir(Visitor visitor) {
        return visitor.exibirColaborador(this);
    }
}
