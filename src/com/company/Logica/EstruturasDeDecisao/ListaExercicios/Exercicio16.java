package com.company.Logica.EstruturasDeDecisao.ListaExercicios;

import java.util.Scanner;

public class Exercicio16 {
    static final Integer VALOR_MINIMO_PARA_EQUACAO_2_GRAU = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ax² + bx + c = 0\ndigite o valor de a: ");
        double valorDeA = scanner.nextDouble();
        boolean valorDaPrimeiraIncognita = valorDeA == VALOR_MINIMO_PARA_EQUACAO_2_GRAU;

        if (valorDaPrimeiraIncognita) {
            System.out.print(" Não é do segundo grau");
        } else {
            System.out.print("digite o valor de b: ");
            Double valorDeB = scanner.nextDouble();
            System.out.print("digite o valor de c: ");
            double valorDeC = scanner.nextDouble();
            double delta = valorDeB * valorDeB - 4 * valorDeA * valorDeC;
            if (delta < 0) {
                System.out.print("a equação não possui raizes reais");
            } else if (delta == 0) {
                System.out.print("a equação possui apenas uma raiz real e o valor de delta é:" + delta);
            } else if (delta > 0) {
                double raizPositiva = (-valorDeB + Math.sqrt(delta)) / (2 * valorDeA);
                double raizNegativa = (-valorDeB - Math.sqrt(delta)) / (2 * valorDeA);
                System.out.print("A primeira raiz é igual a: " + raizPositiva);
                System.out.print("\na segunda raiz é igual a: " + raizNegativa);
            }
            scanner.close();
        }
    }
}