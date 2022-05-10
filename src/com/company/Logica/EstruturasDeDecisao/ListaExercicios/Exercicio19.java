package com.company.Logica.EstruturasDeDecisao.ListaExercicios;

import java.util.Scanner;

public class Exercicio19 {
    static final double PRIMEIRO_NUMERO_NAO_E_VALIDO = 1000;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite um numero inteiro menor que 1000: ");
        double numeroInformado = scanner.nextInt();

        boolean numero_Menor_Que_1000 = numeroInformado > PRIMEIRO_NUMERO_NAO_E_VALIDO;

        if (numero_Menor_Que_1000) {
            System.out.print("digite um numero valido");
        } else {
            double unidade = numeroInformado % 10;
            numeroInformado = (numeroInformado - unidade) / 10;
            double dezena = numeroInformado % 10;
            numeroInformado = (numeroInformado - dezena) / 10;
            double centena = numeroInformado;

            System.out.print(unidade + "unidade(s) || " + dezena + " dezena(s) || " + centena + " centena(s)");
        }
        scanner.close();
    }
}