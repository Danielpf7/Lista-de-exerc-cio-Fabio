package br.edu.uniaeso;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.opencsv.CSVReader;

//!Crie um programa Java que use a biblioteca OpenCSV para ler um arquivo CSV chamado "funcionarios.csv" contendo informações sobre funcionários, como nome, cargo e salário. Permita que o usuário filtre os funcionários com base em critérios, como cargo ou salário mínimo, e exiba os resultados no console.

public class App {

    public static void main(String[] args) {
        try (CSVReader reader = new CSVReader(new FileReader("funcionarios.csv"))) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Filtrar funcionários por:");
            System.out.println("1. Cargo");
            System.out.println("2. Salário mínimo");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            FiltroFuncionarios filtro = new FiltroFuncionarios(reader);

            if (opcao == 1) {
                System.out.println("Digite o cargo:");
                String cargo = scanner.nextLine();
                filtro.filtrarPorCargo(cargo);
            } else if (opcao == 2) {
                System.out.println("Digite o salário mínimo:");
                double salarioMinimo = scanner.nextDouble();
                filtro.filtrarPorSalario(salarioMinimo);
            } else {
                System.out.println("Opção inválida.");
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

