package com.company.Logica.EstruturasDeDecisao.ListaExercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o numero que deseja verificar: ");
        double numeroParaVerificar = scanner.nextDouble();
        if (verificaSePositivo(numeroParaVerificar)) {
            System.out.println("O numero " + numeroParaVerificar + " é positivo!");
        } else {
            System.out.println("O numero " + numeroParaVerificar + " é negativo!");
        }
        scanner.close();
    }

    private static boolean verificaSePositivo(double numeroParaVerificar) {
        return numeroParaVerificar >= 0;
    }
}
