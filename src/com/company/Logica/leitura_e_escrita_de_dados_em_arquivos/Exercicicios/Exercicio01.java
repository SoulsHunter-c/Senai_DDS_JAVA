package com.company.Logica.leitura_e_escrita_de_dados_em_arquivos.Exercicicios;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> linhas = new ArrayList<>();
        String tarefas;
        int i = 0;
        while(true){
            System.out.print("Tarefas " + i + ": ");
            tarefas = scanner.nextLine();
            if("x".equals(tarefas)){
                break;
            }
            linhas.add(tarefas);
            i++;
        }
        Path arquivo = Paths.get("C:\\SENAI ESTUDOS\\ESTUDO JAVA\\listaDeTarefas.txt");
        escreveNoArquivo("C:\\SENAI ESTUDOS\\ESTUDO JAVA\\listaDeTarefas.txt",linhas);
        leLinhaDoAruqivo(arquivo);
        scanner.close();
    }
    private static void leLinhaDoAruqivo (Path arquivo) throws IOException{
        List<String> tarefas1 = Files.readAllLines(arquivo);
        for(int i = 0; i < tarefas1.size(); i++){
            String nome = tarefas1.get(i);
            System.out.println("Tarefa(" + i + "): " + nome);
        }
    }
    private static void escreveNoArquivo(String arquivo, ArrayList<String> linhas) throws IOException{
        Path path = Paths.get(arquivo);
        Files.write(path, linhas);
    }
}