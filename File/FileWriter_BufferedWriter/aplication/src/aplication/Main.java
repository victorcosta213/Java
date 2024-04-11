package aplication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String[] lines = new String[]{ "Good morning", "Good afternoon", "Good night"};
        String path= "/home/victor/learning/java/Curso_Part2/File/out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for(String line: lines){
                bw.write(line);
                bw.newLine();
            }
        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}