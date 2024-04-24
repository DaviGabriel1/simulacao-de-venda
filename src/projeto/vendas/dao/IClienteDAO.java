package projeto.vendas.dao;

import projeto.vendas.domain.Cliente;

public interface IClienteDAO {
    Boolean salvar(Cliente cliente);
    Cliente buscarPorCPF(Long cpf);

    void excluir(Long cpf);
}
