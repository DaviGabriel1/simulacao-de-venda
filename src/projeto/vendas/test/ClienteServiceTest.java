package projeto.vendas.test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import projeto.vendas.dao.IClienteDAO;
import projeto.vendas.domain.Cliente;
import projeto.vendas.service.ClienteService;
import projeto.vendas.service.IClienteService;
import projeto.vendas.test.dao.ClienteDAOMock;

public class ClienteServiceTest {
    private IClienteService clienteService;
    private Cliente cliente;

    public ClienteServiceTest(){
        IClienteDAO dao = new ClienteDAOMock();
        clienteService = new ClienteService(dao);
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

    }
    @Test
    public void pesquisarCliente(){
        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCPF());
        Assert.assertNotNull(clienteConsultado); //teste para não passar sendo null
    }

    @Test
    public void salvarCliente(){
        boolean retorno = clienteService.salvar(cliente);
        Assert.assertTrue(retorno); //testa se volta true
    }
    @Test
    public void excluirCliente(){
        clienteService.excluir(cliente.getCPF());
    }
}
