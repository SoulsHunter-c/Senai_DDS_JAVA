package com.company.Logica.EstruturasDeDecisao.ListaExercicios;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite um ano: ");
        int anoInformado = scanner.nextInt();
        boolean anoBissexto = anoInformado % 4 == 0 && anoInformado % 100 != 0 || anoInformado % 400 == 0;
        if (anoBissexto) {
            System.out.println("O ano é bissexto");
        } else {
            System.out.println("O ano não é bissexto");
        }
        scanner.close();
    }
}