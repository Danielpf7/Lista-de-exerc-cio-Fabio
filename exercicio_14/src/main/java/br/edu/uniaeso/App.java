package br.edu.uniaeso;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class App {

    public static void serializa() {
        ContaBancaria conta = new ContaBancaria("João do Pé de Feijão", 150.0, 002);

        try (FileOutputStream file = new FileOutputStream("Conta.dat");
                ObjectOutputStream out = new ObjectOutputStream(file)) {
            out.writeObject(conta);
            System.out.println("Objeto serializado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        try (FileInputStream file = new FileInputStream("conta.dat");
                ObjectInputStream in = new ObjectInputStream(file)) {
            while (true) {
                try {
                    ContaBancaria Continha = (ContaBancaria) in.readObject();
                    System.out.println("Detalhes da Conta: " + Continha);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

