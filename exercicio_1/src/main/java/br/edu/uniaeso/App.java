package br.edu.uniaeso;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class App {
    public static void main(String[] args) {
        OutputStream arq = null;
        int i = -1;
        String texto = "Olá, mundo!";

        try {
            arq = new FileOutputStream("meuarquivo.txt");
        } catch (FileNotFoundException e) {
            
            System.out.println("Não consegui criar o arquivo");
        }
        do {
            try {
                arq.write(texto.getBytes());
            } catch (IOException e) {
               
                System.out.println("Não consegui escrever no arquivo");
            }
            if (i != -1) {
                System.out.println((char) 1);
            }
        } while (i != -1);

    }
}
