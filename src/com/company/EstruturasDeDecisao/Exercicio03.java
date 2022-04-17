package com.company.EstruturasDeDecisao;
import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o dia da semana desejada[1-7]: ");
        byte diaDaSemana = scanner.nextByte();
        switch (diaDaSemana){
            case 1 -> System.out.println("O dia informado é domingo!!");
            case 2 -> System.out.println("O dia informado é segunda!!");
            case 3 -> System.out.println("O dia informado é terça!!");
            case 4 -> System.out.println("O dia informado é quarta!!");
            case 5 -> System.out.println("O dia informado é quinta!!");
            case 6 -> System.out.println("O dia informado é sexta!!");
            case 7 -> System.out.println("O dia informado é sabado!!");
            default -> System.out.println("O numero informado não é valido!!");
        }
        scanner.close();
    }
}
