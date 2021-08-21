package padroescomportamentais.visitor;

public interface Visitor {

    String exibirCliente(Cliente cliente);
    String exibirColaborador (Colaborador colaborador);
    String exibirGerente(Gerente gerente);

}
