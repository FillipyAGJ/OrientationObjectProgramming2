package Exercicios.provaFinal.questao06;

import java.util.ArrayList;

public class Pedido {
    private float valor_total;
    private ArrayList<ItemPedido> itemProdutos;

    public void adicionar_item(ItemPedido produto) {
        itemProdutos.add(produto);
    }

    public float obter_total() {
        return valor_total;
    }

    public void setValor_total(float valor_total) {
        this.valor_total = valor_total;
    }

    public ArrayList<ItemPedido> getItemProdutos() {
        return itemProdutos;
    }
}
