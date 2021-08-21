package padroescomportamentais.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaVisitorTest {

    @Test
    void deveExibirCliente() {
        Cliente cliente = new Cliente(1, "11100555934", new Pagamento("Crédito"));

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Cliente{id: 1, cpf: 11100555934, formaPagamento: Crédito}", visitor.exibir(cliente));
    }

    @Test
    void deveExibirColaborador() {
        Colaborador colaborador = new Colaborador(1, "11100456032", "Oficial Administrativo");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Colaborador{id: 1, cpf: 11100456032, cargo: Oficial Administrativo}", visitor.exibir(colaborador));
    }

    @Test
    void deveExibirGerente() {
        Gerente gerente = new Gerente(1, "Carlos Gomes", "TI");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Gerente{id: 1, nome: Carlos Gomes, setor: TI}", visitor.exibir(gerente));
    }
}
