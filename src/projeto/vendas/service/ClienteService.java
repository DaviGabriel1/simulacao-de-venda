package projeto.vendas.service;

import projeto.vendas.dao.IClienteDAO;
import projeto.vendas.domain.Cliente;

public class ClienteService implements IClienteService { //regras de negócio

    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO){
        this.clienteDAO = clienteDAO;
    }

    @Override
    public Boolean salvar(Cliente cliente) {
        return clienteDAO.salvar(cliente);
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return clienteDAO.buscarPorCPF(cpf);
    }
    @Override
    public void excluir(Long cpf) {
        //clienteDAO.excluir(cpf);
    }
}
