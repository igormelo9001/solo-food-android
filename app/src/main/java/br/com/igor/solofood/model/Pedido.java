package br.com.igor.solofood.model;

/**
 * Created by igor on 11/03/2018.
 */

public class Pedido {
    private int quantidade;
    private String endereco;
    private String numeroEnd;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumeroEnd() {
        return numeroEnd;
    }

    public void setNumeroEnd(String numeroEnd) {
        this.numeroEnd = numeroEnd;
    }
}
