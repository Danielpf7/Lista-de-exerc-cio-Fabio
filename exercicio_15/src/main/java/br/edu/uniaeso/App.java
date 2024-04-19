package br.edu.uniaeso;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        int tamanhoBuffer = 8192; 

        try (FileInputStream fileIn = new FileInputStream("arquivo_grande.bin");
                FileOutputStream fileOut = new FileOutputStream("copia_arquivo_grande.bin");
                BufferedInputStream bufferedIn = new BufferedInputStream(fileIn);
                BufferedOutputStream bufferedOut = new BufferedOutputStream(fileOut)) {

            byte[] buffer = new byte[tamanhoBuffer];
            int bytesLidos;

            while ((bytesLidos = bufferedIn.read(buffer)) != -1) {
                bufferedOut.write(buffer, 0, bytesLidos);
            }

            System.out.println("Arquivo copiado com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao copiar o arquivo: " + e.getMessage());
        }
    }
}
