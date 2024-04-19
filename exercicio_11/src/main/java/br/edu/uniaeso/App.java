package br.edu.uniaeso;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Marcos", 15);
        Pessoa pessoa1 = new Pessoa("Nicolas", 40);
        Pessoa pessoa2 = new Pessoa("Vanessa", 26);
        Pessoa pessoa3 = new Pessoa("Cristiano", 33);
        
        try (FileOutputStream fileOut = new FileOutputStream("pessoa.dat");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(pessoa);
            out.writeObject(pessoa1);
            out.writeObject(pessoa2);
            out.writeObject(pessoa3);
            System.out.println("Objeto serializado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
