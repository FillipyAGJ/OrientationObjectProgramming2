package exemplos.supermercado;

public class ExemploSupermercado {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        pedido.cliente = new Cliente();
        pedido.cliente.nome = "Gustavo";
        pedido.cliente.cpf = "000.111.222-33";

        System.out.println(pedido.cliente.cpf);

        pedido.itens = new Item();
        pedido.itens.qtdCompra = 10;
        pedido.itens.valorTotal = 100F;

        pedido.itens.produto = new Produto();
        pedido.itens.produto.codigo = 1654321L;
        pedido.itens.produto.preco = 10F;
        pedido.itens.produto.qtdEstoque = 200;

        pedido.pagamento = "dinheiro";
        System.out.println(pedido.pagamento);
        System.out.println(pedido.itens.valorTotal);
    }
}
