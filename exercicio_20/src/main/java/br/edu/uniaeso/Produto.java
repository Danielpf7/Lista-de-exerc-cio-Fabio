package br.edu.uniaeso;

import com.opencsv.bean.CsvBindByName;

public class Produto {

    @CsvBindByName(column = "Nome")
    private String nome;

    @CsvBindByName(column = "Preço")
    private double preco;

    @CsvBindByName(column = "Quantidade")
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto [nome = " + nome + ", preco = " + preco + ", quantidade = " + quantidade + "]";
    }
}

