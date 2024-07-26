import com.lanchonete.atendimento.cozinha.Almoxarife;
import com.lanchonete.atendimento.Atendente;
import com.lanchonete.area.cliente.Cliente;
import com.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        Atendente atendente = new Atendente();
        atendente.receberPagamento();

        Cozinheiro cozinheiro = new Cozinheiro();
        cozinheiro.adicionarSucoNoBalcao();;
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        atendente.servindoMesa();
    }
}