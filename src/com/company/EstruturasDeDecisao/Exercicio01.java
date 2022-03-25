package com.company.EstruturasDeDecisao;
import java.util.Scanner;
public class Exercicio01 {
    private static final int NOTA_MINIMA_PARA_PASSAR = 150;
    private static final int NOTA_MINIMA_POR_MATERIA = 60;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a nota da sua prova de matematica: ");
        double notaDeMatematica = scanner.nextDouble();
        System.out.print("Insira a nota da sua prova de portugues: ");
        double notaDePortugues = scanner.nextDouble();
        boolean temMediaAnual = notaTotalDasProvas(notaDeMatematica,notaDePortugues) >= NOTA_MINIMA_PARA_PASSAR;
        if(temMediaNasProvas(notaDeMatematica,notaDePortugues) && notaTotalDasProvas(notaDeMatematica,notaDePortugues) >= NOTA_MINIMA_POR_MATERIA) {
            System.out.println("Parabens voce passou com media " + notaTotalDasProvas(notaDeMatematica,notaDePortugues) + "!!");
        }else{
            System.out.println("Infelizmente voce foi reprovado, sua media foi " + notaTotalDasProvas(notaDeMatematica,notaDePortugues) + "!!");
        }
        scanner.close();
    }
    private static boolean temMediaNasProvas(double notaDeMatematica , double notaDePortuges){
        return notaDeMatematica >= NOTA_MINIMA_POR_MATERIA && notaDePortuges >= NOTA_MINIMA_POR_MATERIA;
    }
    private static double notaTotalDasProvas(double notaDeMatematica , double notaDePortugues){
        return notaDeMatematica + notaDePortugues;
    }
}
