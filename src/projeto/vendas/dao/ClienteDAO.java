package projeto.vendas.dao;

import projeto.vendas.domain.Cliente;

public class ClienteDAO implements IClienteDAO{
    @Override
    public void excluir(Long cpf) {

    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return null;
    }

    @Override
    public Boolean salvar(Cliente cliente) {
        return true;
    }
}
