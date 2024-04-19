package br.edu.uniaeso;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public static void main(String[] args) {
        int contador = 0;
        BufferedReader leitor = null;

        try {
            leitor = new BufferedReader(new FileReader("meuarquivo.txt"));
            String linha;

            Pattern padrao = Pattern.compile("\\b" + "(?i)java" + "\\b");

            while ((linha = leitor.readLine()) != null) {

                Matcher matcher = padrao.matcher(linha);

                while (matcher.find()) {
                    contador++;
                }
            }

            System.out.println("A palavra '" + "java" + "' apareceu " + contador + " vezes no texto.");

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } finally {
            if (leitor != null) {
                try {
                    leitor.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
