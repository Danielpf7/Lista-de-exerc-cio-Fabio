package br.edu.uniaeso;

import java.io.BufferedReader;
import java.io.FileReader;

public class App {
    public static void main(String[] args) {
        BufferedReader ler = null;

        try {
            ler = new BufferedReader(new FileReader("meuarquivo.txt"));
            String str;
            while ((str = ler.readLine()) != null) {
                System.out.println(str);
            }
        } catch (Exception e) {
        
            System.out.println("Não consegui encontrar o arquivo");
        }
    }
}
