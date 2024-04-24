package projeto.vendas.test;
import org.junit.Assert;
import org.junit.Test;
import projeto.vendas.dao.IClienteDAO;
import projeto.vendas.domain.Cliente;
import projeto.vendas.service.ClienteService;
import projeto.vendas.service.IClienteService;
import projeto.vendas.test.dao.ClienteDAOMock;

public class ClienteTest {
        private IClienteService clienteService;
        public ClienteTest(){
            IClienteDAO dao = new ClienteDAOMock();
            clienteService = new ClienteService(dao);
        }
    @Test
    public void pesquisarCliente(){
        Cliente cliente = new Cliente();
        cliente.setCPF(432213312L);
        cliente.setNome("Davi");
        cliente.setCidade("Itapevi");
        cliente.setEnd("rua java");
        cliente.setEstado("SP");
        cliente.setNumero(44);
        cliente.setTel(113043234L);

        clienteService.salvar(cliente);
        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCPF());
        Assert.assertNotNull(clienteConsultado); //teste para não passar sendo null
    }
}
