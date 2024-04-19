package br.edu.uniaeso;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args){
        BufferedWriter escritor1 = null;
        BufferedWriter escritor2 = null;
        BufferedReader leitor1 = null;
        BufferedReader leitor2 = null;
        BufferedWriter escritorConcatenado = null;
        try {
            escritor1 = new BufferedWriter(new FileWriter("arquivo1.txt"));
            escritor2 = new BufferedWriter(new FileWriter("arquivo2.txt"));
            escritor1.write("Este é o conteúdo do arquivo1.\nLinha 2 do arquivo1.");
            escritor2.write("Este é o conteúdo do arquivo2.\nLinha 2 do arquivo2.");

            System.out.println("Arquivos 'arquivo1.txt' e 'arquivo2.txt' criados com conteúdo.");
        } catch (IOException e) {
            System.out.println("Erro ao criar os arquivos: " + e.getMessage());
        } finally {
            if ((escritor1 != null) && (escritor2 != null)) {

                try {
                    escritor1.close();
                    escritor2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        try {
            leitor1 = new BufferedReader(new FileReader("arquivo1.txt"));
            leitor2 = new BufferedReader(new FileReader("arquivo2.txt"));
            escritorConcatenado = new BufferedWriter(new FileWriter("arquivo_concatenado.txt"));

            String linha;
            while ((linha = leitor1.readLine()) != null) {
                escritorConcatenado.write(linha);
                escritorConcatenado.newLine();
            }
            while ((linha = leitor2.readLine()) != null) {
                escritorConcatenado.write(linha);
                escritorConcatenado.newLine();
            }

            System.out.println("Arquivo 'arquivo_concatenado.txt' criado com conteúdo concatenado.");
        } catch (IOException e) {
            System.out.println("Erro ao manipular arquivos: " + e.getMessage());
        }finally {
            if ((leitor1 != null) && (leitor2 != null) && (escritorConcatenado != null)) {

                try {
                    leitor1.close();
                    leitor2.close();
                    escritorConcatenado.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
