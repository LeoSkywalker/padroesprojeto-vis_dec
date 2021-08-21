package padroesestruturais.decorator;

import java.text.DecimalFormat;

public abstract class PagamentoDecorator implements Pagamento {

    private Pagamento pagamento;
    public String estrutura;

    public PagamentoDecorator(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public abstract float getPercentualPagamentoValorTotal();

    public float getValorTotal() {
        return this.pagamento.getValorTotal() * this.getPercentualPagamentoValorTotal();
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.pagamento.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }
}
