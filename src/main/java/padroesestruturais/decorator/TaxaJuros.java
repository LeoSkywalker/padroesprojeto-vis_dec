package padroesestruturais.decorator;

public class TaxaJuros extends PagamentoDecorator{

    public TaxaJuros(Pagamento pagamento) {
        super(pagamento);
    }

    public float getPercentualPagamentoValorTotal() {
        return (1 + (2.0f/100));
    }

    public String getNomeEstrutura() {
        return "Juros: 2% a.m.";
    }
}
