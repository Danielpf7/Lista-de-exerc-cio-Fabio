package br.edu.uniaeso;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    

    public static void main(String[] args) {
        String line;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("dados.csv"));

            while ((line = br.readLine()) != null) {
                String[] pessoa = line.split(",");
                System.out.println("[Nome=" + pessoa[0] + ", Idade=" + pessoa[1] + ", Email=" + pessoa[2] + "]");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(br!= null){
                try {
                    br.close();
                } catch (IOException e) {
            
                    e.printStackTrace();
                }
            }
        }
    }
}
