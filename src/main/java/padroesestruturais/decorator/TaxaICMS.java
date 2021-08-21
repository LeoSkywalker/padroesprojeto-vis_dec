package padroesestruturais.decorator;

public class TaxaICMS extends PagamentoDecorator{

    public TaxaICMS(Pagamento pagamento) {
        super(pagamento);
    }

    public float getPercentualPagamentoValorTotal() {
        return (1 + (12.0f/100));
    }

    public String getNomeEstrutura() {
        return "ICMS: 12% - RJ";
    }
}
