package padroescomportamentais.visitor;

public class Cliente implements Pessoa{

    private int id;
    private String cpf;
    private Pagamento pagamento;

    public Cliente(int id, String cpf, Pagamento pagamento) {
        this.id = id;
        this.cpf = cpf;
        this.pagamento = pagamento;
    }

    public int getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public String getFormaPagamento() {
        return this.pagamento.getFormaPagamento();
    }

    @Override
    public String permitir(Visitor visitor) {
        return visitor.exibirCliente(this);
    }
}
