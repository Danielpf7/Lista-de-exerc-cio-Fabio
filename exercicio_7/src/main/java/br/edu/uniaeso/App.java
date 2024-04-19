package br.edu.uniaeso;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        BufferedReader arq = null;
        BufferedWriter writer = null;

        List<String> linhas = new ArrayList<>();

        try {
            arq = new BufferedReader(new FileReader("meuarquivo.txt"));
            String linha;
            while ((linha = arq.readLine()) != null) {
                linhas.add(linha);
            }

        } catch (Exception e) {
    
            System.out.println("Erro ao ler o arquivo ");
            e.printStackTrace();
        } finally {
            try {
                if (arq != null) {
                    arq.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Collections.sort(linhas);

        
        try {
            writer = new BufferedWriter(new FileWriter("meuarquivo_ordenado.txt"));
            for (String line : linhas) {
                writer.write(line);
                writer.newLine();
            }
            writer.flush(); 
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("Arquivo ordenado!");
    }
}

