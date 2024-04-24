package projeto.vendas.service;

import projeto.vendas.domain.Cliente;

public interface IClienteService {
    Boolean salvar(Cliente cliente);

    Cliente buscarPorCPF(Long cpf);

    void excluir(Long cpf);
}
