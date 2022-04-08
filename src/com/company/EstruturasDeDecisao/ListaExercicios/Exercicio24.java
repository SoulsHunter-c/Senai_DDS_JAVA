package com.company.EstruturasDeDecisao.ListaExercicios;
import java.util.Scanner;
public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double resultadoFinal = 0;

        System.out.print("Insira o primeiro numero desejado: ");
        double primeiroNumeroInformado = scanner.nextDouble();
        System.out.print("insira o segundo numero desejado: ");
        double segundoNumeroInformado = scanner.nextDouble();
        System.out.println("SELECIONE A OPERAÇÃO DESEJADA:\n[1]-ADIÇÃO\n[2]-SUBTRAÇÃo\n[3]-MULTIPLICAÇÃO\n[4]-DIVISÃO");
        byte operacaoSelecionada = scanner.nextByte();
        switch (operacaoSelecionada){
            case 1 -> resultadoFinal = primeiroNumeroInformado + segundoNumeroInformado;
            case 2 -> resultadoFinal = primeiroNumeroInformado - segundoNumeroInformado;
            case 3 -> resultadoFinal = primeiroNumeroInformado * segundoNumeroInformado;
            case 4 -> resultadoFinal = primeiroNumeroInformado / segundoNumeroInformado;
        }
    }
    private static boolean verificaSePar(double resultadoFinal){
        return resultadoFinal % 2 == 0;
    }
    private static boolean verificaSePositivo(double resultadoFinal){
        return resultadoFinal >= 0;
    }
    private static boolean verificaSeInteiro(double resultadoFInal){
        return resultadoFInal == resultadoFInal;
    }
}
