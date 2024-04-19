package br.edu.uniaeso;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader("meuarquivo.txt"));
            writer = new BufferedWriter(new FileWriter("meuarquivo_python.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replace("Java", "Python");
                line = line.replace("java", "python");
                
                writer.write(line);
            
                writer.newLine();
            }
            System.out.println("Substituição concluída.");
        } finally {
            if (reader != null)
                reader.close();
            if (writer != null)
                writer.close();
        }
    }
}
