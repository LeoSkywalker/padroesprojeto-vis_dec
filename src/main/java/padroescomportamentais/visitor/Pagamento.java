package padroescomportamentais.visitor;

public class Pagamento {

    private String formaPagamento;

    public Pagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }
}
