package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PagamentoTest {

    @Test
    void deveRetornarValorTotalPagamentoBoleto(){
        Pagamento pagamento = new PagamentoBoleto(100.0f);
        assertEquals(100.0f, pagamento.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalPagamentoBoletoComTaxaICMS() {
        Pagamento pagamento = new TaxaICMS(new PagamentoBoleto(100.0f));
        assertEquals(112.0f, pagamento.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalPagamentoBoletoComTaxaISS() {
        Pagamento pagamento = new TaxaISS(new PagamentoBoleto(100.0f));
        assertEquals(103.5f, pagamento.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalPagamentoBoletoComTaxaJuros() {
        Pagamento pagamento = new TaxaJuros(new PagamentoBoleto(100.0f));
        assertEquals(102.0f, pagamento.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalPagamentoBoletoComTaxaICMSMaisTaxaISS() {
        Pagamento pagamento = new TaxaICMS(new TaxaISS(new PagamentoBoleto(100.0f)));
        assertEquals(115.92f, pagamento.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalPagamentoBoletoComTaxaICMSMaisTaxaJuros() {
        Pagamento pagamento = new TaxaICMS(new TaxaJuros(new PagamentoBoleto(100.0f)));
        assertEquals(114.24f, pagamento.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalPagamentoBoletoComTaxaISSMaisTaxaJuros() {
        Pagamento pagamento = new TaxaJuros(new TaxaISS(new PagamentoBoleto(100.0f)));
        assertEquals(105.57f, pagamento.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalPagamentoBoletoComTaxaICMSMaisTaxaJurosMaisTaxaISS() {
        Pagamento pagamento = new TaxaISS(new TaxaJuros (new TaxaICMS(new PagamentoBoleto(100.0f))));
        assertEquals(118.238396f, pagamento.getValorTotal());
    }

    @Test
    void deveRetornarEstruturaPagamento() {
        Pagamento pagamento = new PagamentoBoleto();
        assertEquals("Pagamento Boleto", pagamento.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPagamentoComTaxaICMS() {
        Pagamento pagamento = new TaxaICMS(new PagamentoBoleto());
        assertEquals("Pagamento Boleto/ICMS: 12% - RJ", pagamento.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPagamentoComTaxaISS() {
        Pagamento pagamento = new TaxaISS(new PagamentoBoleto());
        assertEquals("Pagamento Boleto/ISS: 3,5%", pagamento.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPagamentoComTaxaJuros() {
        Pagamento pagamento = new TaxaJuros(new PagamentoBoleto());
        assertEquals("Pagamento Boleto/Juros: 2% a.m.", pagamento.getEstrutura());
    }

    @Test
    void deveRetornarEstrururaPagamentoComTaxaISSMaisTaxaICMS() {
        Pagamento pagamento = new TaxaICMS(new TaxaISS(new PagamentoBoleto()));
        assertEquals("Pagamento Boleto/ISS: 3,5%/ICMS: 12% - RJ", pagamento.getEstrutura());
    }

    @Test
    void deveRetornarEstrururaPagamentoComTaxaJurosMaisTaxaICMS() {
        Pagamento pagamento = new TaxaICMS(new TaxaJuros(new PagamentoBoleto()));
        assertEquals("Pagamento Boleto/Juros: 2% a.m./ICMS: 12% - RJ", pagamento.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPagamentoBoletoComTaxaISSMaisTaxaJuros() {
        Pagamento pagamento = new TaxaJuros(new TaxaISS(new PagamentoBoleto()));
        assertEquals("Pagamento Boleto/ISS: 3,5%/Juros: 2% a.m.", pagamento.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPagamentoBoletoComTaxaICMSMaisTaxaJurosMaisTaxaISS() {
        Pagamento pagamento = new TaxaISS(new TaxaJuros (new TaxaICMS(new PagamentoBoleto())));
        assertEquals("Pagamento Boleto/ICMS: 12% - RJ/Juros: 2% a.m./ISS: 3,5%", pagamento.getEstrutura());
    }
}
