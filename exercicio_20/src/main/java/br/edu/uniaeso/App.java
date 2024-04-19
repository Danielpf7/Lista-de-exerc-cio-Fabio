package br.edu.uniaeso;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class App {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        Reader reader = null;
        try {
            reader = Files.newBufferedReader(Paths.get("produtos.csv"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        CsvToBean<Produto> csvToBean = new CsvToBeanBuilder(reader).withType(Produto.class).build();
        List<Produto> produtos = csvToBean.parse();

        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}

