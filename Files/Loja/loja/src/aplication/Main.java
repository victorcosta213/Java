package aplication;

import entities.Loja;
import entities.Product;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String path = "/home/victor/learning/java/Curso/File/Loja/itens.csv";
        Loja loja = new Loja();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while (line != null){
                String[] itens = line.split(",");
                String nome = itens[0];
                double preco = Double.parseDouble(itens[1]);
                int quantidade = Integer.parseInt(itens[2]);
                Product p1 = new Product(nome,preco,quantidade);
                loja.addProduct(p1);
                loja.totalProduct();
                line = br.readLine();


            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}