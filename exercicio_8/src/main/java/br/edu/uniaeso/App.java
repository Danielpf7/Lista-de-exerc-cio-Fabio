package br.edu.uniaeso;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        BufferedReader leitor = null;
        BufferedWriter escritor = null;
        String linha;
        try {
            leitor = new BufferedReader(new FileReader("meuarquivo.txt"));
            escritor = new BufferedWriter(new FileWriter("meuarquivo_sem_excluir.txt"));

            while ((linha = leitor.readLine()) != null) {
                linha = linha.replaceAll("excluir", "");

                escritor.write(linha);
                escritor.newLine();
            }

            System.out.println("Ocorrências das palavras foram removidas com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao manipular arquivos: " + e.getMessage());
        }finally{
            if ((leitor != null)&&(escritor != null)) {
                try {
                    leitor.close();
                    escritor.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                
            }
        }
    }
}

