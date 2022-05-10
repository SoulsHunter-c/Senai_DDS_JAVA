package com.company.Logica.leitura_e_escrita_de_dados_em_arquivos.Exercicicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) throws IOException {
         Scanner scanner = new Scanner(System.in);
         Path arquivo = Paths.get("C:\\SENAI ESTUDOS\\ESTUDO JAVA\\Exercicio02");
         String caminhoArquivo = "C:\\SENAI ESTUDOS\\ESTUDO JAVA\\Exercicio02";
         ArrayList<String> tarefas = new ArrayList<>();
         String tarefa;
         int i = 0;
         while(true){
             System.out.print("Insira a " + i + " tarefa: ");
             tarefa = scanner.nextLine();
             if("x".equals(tarefa)){
                 break;
             }
             tarefas.add(tarefa);
             i++;
         }
         escreveNoArquivo(caminhoArquivo,tarefas);
         leOArquivo(arquivo);
         scanner.close();
    }
    private static void escreveNoArquivo(String caminhoDoArquivo, ArrayList<String> tarefas) throws IOException{
        Path path = Paths.get(caminhoDoArquivo);
        Files.write(path, tarefas);
    }
    private static void leOArquivo(Path arquivo) throws IOException{
        List<String> leituraDoArquivo = Files.readAllLines(arquivo);
        for(int i = 0; i < leituraDoArquivo.size(); i++){
            System.out.println("Tarefa informada(" + i + "): " + leituraDoArquivo.get(i));
        }
    }
}
