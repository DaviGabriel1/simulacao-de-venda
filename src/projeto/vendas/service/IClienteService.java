package projeto.vendas.service;

import projeto.vendas.domain.Cliente;

public interface IClienteService {
    void salvar(Cliente cliente);

    Cliente buscarPorCPF(Long cpf);
}
