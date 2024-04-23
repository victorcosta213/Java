package aplication;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path = "/home/victor/learning/java/Curso/Files/Loja/itens.csv";
        List<Product>l1 = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null){
                String[] itens = line.split(",");
                String nome = itens[0];
                double preco = Double.parseDouble(itens[1]);
                int quantidade = Integer.parseInt(itens[2]);
                l1.add(new Product(nome,preco,quantidade));
                line= br.readLine();
            }
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
                for (Product i:l1) {
                    bw.write("nome do produto: "+i.getNome()+"  Total R$"+i.total()+"\n");
                }
                System.out.println("Processado com Sucesso!");
            }
            catch (IOException e){
                System.out.println("Error: "+e.getMessage());
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }



}