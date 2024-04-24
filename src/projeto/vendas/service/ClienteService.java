package projeto.vendas.service;

import projeto.vendas.dao.IClienteDAO;
import projeto.vendas.domain.Cliente;

public class ClienteService implements IClienteService { //regras de negócio

    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO){
        this.clienteDAO = clienteDAO;
    }

    @Override
    public void salvar(Cliente cliente) {
        clienteDAO.salvar(cliente);
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return clienteDAO.buscarPorCPF(cpf);
    }
}
