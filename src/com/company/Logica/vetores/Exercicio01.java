package com.company.Logica.vetores;
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tarefasMaisImportantes = new String[5];

        for(int i=0; i < tarefasMaisImportantes.length;i++){
            System.out.println("Insira a " + i + " tarefa mais importante: ");
            tarefasMaisImportantes[i] = scanner.next();
        }
        System.out.println("As tarefas informadas são:");
        for (int i=0; i < tarefasMaisImportantes.length;i++){
            System.out.println(tarefasMaisImportantes[i]);
        }
        scanner.close();
    }
}
