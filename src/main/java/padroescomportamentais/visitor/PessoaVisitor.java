package padroescomportamentais.visitor;

public class PessoaVisitor implements Visitor{

    public String exibir(Pessoa pessoa){
        return pessoa.permitir(this);
    }

    @Override
    public String exibirCliente(Cliente cliente) {
        return "Cliente{" +
                "id: " + cliente.getId() +
                ", cpf: " + cliente.getCpf() +
                ", formaPagamento: " + cliente.getFormaPagamento() +
                "}";
    }

    @Override
    public String exibirColaborador(Colaborador colaborador) {
        return "Colaborador{" +
                "id: " + colaborador.getId() +
                ", cpf: " + colaborador.getCpf() +
                ", cargo: " + colaborador.getCargo() +
                "}";
    }

    @Override
    public String exibirGerente(Gerente gerente) {
        return "Gerente{" +
                "id: " + gerente.getId() +
                ", nome: " + gerente.getNome() +
                ", setor: " + gerente.getSetor() +
                "}";
    }
}
