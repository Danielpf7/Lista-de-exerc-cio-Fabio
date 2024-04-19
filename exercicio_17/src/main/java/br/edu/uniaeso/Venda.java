package br.edu.uniaeso;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Venda {
    // Campos da venda
    private int id;
    private String produto;
    private int quantidade;
    private double valorTotal;

    // Construtor
    public Venda(int id, String produto, int quantidade, double valorTotal) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
    }

    // Métodos de acesso
    public int getId() {
        return id;
    }

    public String getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    // Método para salvar a venda em um arquivo binário
    public void save(DataOutputStream out) throws IOException {
        out.writeInt(id);
        out.writeUTF(produto);
        out.writeInt(quantidade);
        out.writeDouble(valorTotal);
    }

    // Método para carregar uma venda de um arquivo binário
    public static Venda load(DataInputStream in) throws IOException {
        int id = in.readInt();
        String produto = in.readUTF();
        int quantidade = in.readInt();
        double valorTotal = in.readDouble();
        return new Venda(id, produto, quantidade, valorTotal);
    }

    // Método para representar a venda como string
    @Override
    public String toString() {
        return "ID: " + id + ", Produto: " + produto + ", Quantidade: " + quantidade + ", Valor Total: " + valorTotal;
    }
}

