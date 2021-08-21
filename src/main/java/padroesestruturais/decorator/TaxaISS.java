package padroesestruturais.decorator;

public class TaxaISS extends PagamentoDecorator{

    public TaxaISS(Pagamento pagamento) {
        super(pagamento);
    }

    public float getPercentualPagamentoValorTotal() {
        return (1 + (3.5f/100));
    }

    public String getNomeEstrutura() {
        return "ISS: 3,5%";
    }
}
