package com.company.EstruturasDeDecisao.ListaExercicios;
import java.util.Scanner;
public class Exercicio14 {
    private static final byte TOTAL_DE_NOTAS = 2;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a primeira nota parcial: ");
        double primeiraNotaParcial = scanner.nextDouble();
        System.out.print("Insira a segunda nota parcial: ");
        double segundaNotaParcial = scanner.nextDouble();
        double mediaDoAluno = calculaMediaDoAluno(primeiraNotaParcial,segundaNotaParcial);
        if(verificaSeNotaA(mediaDoAluno)){
            System.out.println("Voce passou com nota A!!");
        }else if(verificaSeNotaB(mediaDoAluno)){
            System.out.println("Voce passou com nota B!!");
        }else if(verificaSeNotaC(mediaDoAluno)){
            System.out.println("Voce foi aprovado com nota C");
        }else if(verificaSeNotaD(mediaDoAluno)){
            System.out.println("Voce foi reprovado, tirou nota D.");
        }else if(verificaSeNotaE(mediaDoAluno)){
            System.out.print("Voce foi reprovado, tirou nota E.");
        }
    }
    private static double calculaMediaDoAluno(double primeiraNotaParcial , double segundaNotaParcial){
        return (primeiraNotaParcial + segundaNotaParcial)/TOTAL_DE_NOTAS;
    }
    private static boolean verificaSeNotaA(double mediaDoAluno){
        return mediaDoAluno >= 9.0 && mediaDoAluno <= 10.0;
    }
    private static boolean verificaSeNotaB(double mediaDoAluno){
        return mediaDoAluno >= 7.5 && mediaDoAluno < 9.0;
    }
    private static boolean verificaSeNotaC(double mediaDoAluno){
        return mediaDoAluno >= 6.0 && mediaDoAluno < 7.5;
    }
    private static boolean verificaSeNotaD(double mediaDoAluno){
        return mediaDoAluno >= 4.0 && mediaDoAluno < 6.0;
    }
    private static boolean verificaSeNotaE(double mediaDoAluno){
        return mediaDoAluno >= 0 && mediaDoAluno < 4.0;
    }
}
