package br.edu.uniaeso;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        BufferedReader files = null;
        BufferedWriter esc = null;
        String umaString = "\nIsso é uma adição";

        try {
            files = new BufferedReader(new FileReader("meuarquivo.txt"));
            String s;
            while ((s = files.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado !!");
        }

        try {
            esc = new BufferedWriter(new FileWriter("meuarquivo.txt", true));
            esc.append(umaString);
        } catch (IOException e) {
        
            e.printStackTrace();
        }

        esc.close();

    }
}

