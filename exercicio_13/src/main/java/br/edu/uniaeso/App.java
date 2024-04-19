package br.edu.uniaeso;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class App {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Produto A", 10.0));
        produtos.add(new Produto("Produto B", 20.0));
        produtos.add(new Produto("Produto C", 30.0));

        try (FileOutputStream fileOut = new FileOutputStream("produtos.dat");
                ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(produtos);
            System.out.println("Lista de produtos serializada com sucesso em produtos.dat");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fileIn = new FileInputStream("produtos.dat");
                ObjectInputStream in = new ObjectInputStream(fileIn)) {
            List<Produto> produtosDeserializados = (List<Produto>) in.readObject();
            System.out.println("Lista de produtos deserializada com sucesso.");

            for (Produto produto : produtosDeserializados) {
                System.out.println(produto);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

