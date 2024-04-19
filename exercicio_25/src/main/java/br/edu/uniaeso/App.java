package br.edu.uniaeso;

import java.util.ArrayList;
import java.util.List;

//! Desenvolva um programa que crie uma lista de objetos da classe `Venda`, onde cada objeto representa uma venda com informações como data, valor e produto vendido. Use a biblioteca OpenCSV para exportar essas vendas para um arquivo CSV chamado "vendas.csv".
public class App {
    public static void main(String[] args) {

        List<Venda> vendas = new ArrayList<>();
        vendas.add(new Venda("2024-04-15", 100.0, "Produto A"));
        vendas.add(new Venda("2024-04-16", 150.0, "Produto B"));
        vendas.add(new Venda("2024-04-17", 200.0, "Produto C"));

        Venda.exportarVendasParaCSV(vendas, "vendas.csv");

        System.out.println("Vendas exportadas para vendas.csv com sucesso!");
    }

}

