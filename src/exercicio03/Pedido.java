package exercicio03;


import java.util.ArrayList;

public class Pedido<T extends ProdutoX> {
    private ArrayList<T> produtos;

    public ArrayList<T> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<T> produtos) {
        this.produtos = produtos;
    }
}
