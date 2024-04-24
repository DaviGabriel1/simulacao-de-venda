package projeto.vendas.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import projeto.vendas.dao.IClienteDAO;
import projeto.vendas.domain.Cliente;
import projeto.vendas.test.dao.ClienteDAOMock;

public class ClienteDAOTest {
    private IClienteDAO clienteDAO;
    private Cliente cliente;

    public ClienteDAOTest(){
        clienteDAO = new ClienteDAOMock();
    }

    @Before //executa antes para inicializar o objeto
    public void init(){
        cliente = new Cliente();
        cliente.setCPF(432213312L);
        cliente.setNome("Davi");
        cliente.setCidade("Itapevi");
        cliente.setEnd("rua java");
        cliente.setEstado("SP");
        cliente.setNumero(44);
        cliente.setTel(113043234L);
        clienteDAO.salvar(cliente);
    }
    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteDAO.buscarPorCPF(cliente.getCPF());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void excluirCliente(){
        clienteDAO.excluir(cliente.getCPF());
    }
}
