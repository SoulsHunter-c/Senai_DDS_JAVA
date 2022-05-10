package com.company.Logica.leitura_e_escrita_de_dados_em_arquivos.Exercicicios;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Treino {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path path = Paths.get("C:\\SENAI ESTUDOS\\ESTUDO JAVA\\Treino.txt");
        ArrayList<String> listaDeTarefas = new ArrayList<>();
        String tarefa;
        int i = 0;
        while(true){
            System.out.print("Insira a " + i + " tarefa que tens que realizar: ");
            tarefa = scanner.nextLine();
            if("x".equals(tarefa)){
                break;
            }
            listaDeTarefas.add(tarefa);
            i++;
        }
        escreveTarefasNoArquivo(String.valueOf(path), listaDeTarefas);
        leOArquivo(path);
        scanner.close();
    }
    private static void leOArquivo(Path path) throws IOException{
        List<String> leOArquivo = Files.readAllLines(path);
        for(int i =0; i < leOArquivo.size(); i++){
            System.out.println("Tarefa(" + i + "): " + leOArquivo.get(i));
        }
    }
    private static void escreveTarefasNoArquivo(String caminhoDoArquivo, ArrayList<String> tarefas) throws IOException{
        Path path = Paths.get(caminhoDoArquivo);
        Files.write(path, tarefas);
    }
}
