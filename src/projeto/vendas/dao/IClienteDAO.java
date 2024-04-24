package projeto.vendas.dao;

import projeto.vendas.domain.Cliente;

public interface IClienteDAO {
    void salvar(Cliente cliente);
    Cliente buscarPorCPF(Long cpf);
}
