package Exercicios.provaFinal.questao06;

import java.util.ArrayList;

public class Produto {
    private int codigo;
    private float valor;
    private String descricao;

    private ArrayList<ItemPedido> itemPedidos;

    public Produto(int codigo, float valor, String descricao) {
        this.codigo = codigo;
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<ItemPedido> getItemPedidos() {
        return itemPedidos;
    }

    public void setItemPedidos(ArrayList<ItemPedido> itemPedidos) {
        this.itemPedidos = itemPedidos;
    }
}
