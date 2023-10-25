package exercicio03;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        Arroz arrozIntegral = new Arroz();
        pedido.getProdutos().add(arrozIntegral);

        OutroProduto outroProduto = new OutroProduto();
        pedido.getProdutos().add(outroProduto); //erro pq não aceita produtos que não são filhos de ProdutoX
    }
}
