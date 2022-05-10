package com.company.Logica.EstruturasDeDecisao.ListaExercicios;

import java.util.Scanner;

public class Exercicio20 {
    static final double NUMERO_MINIMO_PARA_SER_APROVADO = 7;
    static final double NUMERO_MAXIMO_POSSIVEL_EM_UMA_PROVA = 10;
    static final double NUMERO_MINIMO_POSSIVEL_NA_PROVA = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite a 1º nota do aluno: ");
        Double primeiraNotaInformada = scanner.nextDouble();
        System.out.print("digite a 2º nota do aluno: ");
        Double segundaNotaInformada = scanner.nextDouble();
        System.out.print("digite a 3º nota do aluno: ");
        Double terceiraNotaInformada = scanner.nextDouble();

        double mediaDasTresNotas = obterMediaDasTresNotas(primeiraNotaInformada, segundaNotaInformada, terceiraNotaInformada);
        boolean notaMaiorQueSETE = mediaDasTresNotas >= NUMERO_MINIMO_PARA_SER_APROVADO;
        boolean notaMaximaMenorQueDez = mediaDasTresNotas < NUMERO_MAXIMO_POSSIVEL_EM_UMA_PROVA;
        boolean notaMaximaParaSerAprovado = mediaDasTresNotas < NUMERO_MAXIMO_POSSIVEL_EM_UMA_PROVA;
        boolean notaMinimaDaProva = mediaDasTresNotas >= NUMERO_MINIMO_POSSIVEL_NA_PROVA;
        boolean notaMaximaPossivel = mediaDasTresNotas == NUMERO_MAXIMO_POSSIVEL_EM_UMA_PROVA;

        if (notaMaiorQueSETE && notaMaximaMenorQueDez) {
            System.out.print("Aprovado com " + mediaDasTresNotas);
        } else if (notaMaximaParaSerAprovado && notaMinimaDaProva) {
            System.out.print("Reprovado com " + mediaDasTresNotas);
        } else if (notaMaximaPossivel) {
            System.out.print("Aprovado com Distinção");
        }
        scanner.close();
    }

    private static double obterMediaDasTresNotas(Double primeiraNotaDoAluno, Double segundaNotaDoAluno, Double terceiraNotaDoAluno) {
        return (primeiraNotaDoAluno + segundaNotaDoAluno + terceiraNotaDoAluno) / 3;
    }
}