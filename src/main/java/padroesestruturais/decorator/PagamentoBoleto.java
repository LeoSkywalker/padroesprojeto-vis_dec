package padroesestruturais.decorator;

public class PagamentoBoleto implements Pagamento{

    public float valorTotalPagamento;

    public PagamentoBoleto() {}

    public PagamentoBoleto(float valorTotalPagamento) {
        this.valorTotalPagamento = valorTotalPagamento;
    }

    public float getValorTotal() {
        return valorTotalPagamento;
    }

    public String getEstrutura() {
        return "Pagamento Boleto";
    }
}
