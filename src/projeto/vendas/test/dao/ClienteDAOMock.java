package projeto.vendas.test.dao;

import projeto.vendas.dao.IClienteDAO;
import projeto.vendas.domain.Cliente;

public class ClienteDAOMock implements IClienteDAO {
    @Override
    public void excluir(Long cpf) {

    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCPF(cpf);
        return cliente;
    }

    @Override
    public Boolean salvar(Cliente cliente) {
        return true;
    }
}
