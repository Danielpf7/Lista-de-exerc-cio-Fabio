package br.edu.uniaeso;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader files = null;

        try {
            files = new BufferedReader(new FileReader("meuarquivo.txt"));
            String s;
            int i = 0;
            while ((s = files.readLine()) != null) {
                System.out.println(s);
                i++;
            }
            System.out.println("O arquivo tem: " + i + " Linhas");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado !!");
        }
    }
}

