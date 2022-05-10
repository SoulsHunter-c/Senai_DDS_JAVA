package com.company.Logica.EstrturaDeRepeticao;
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira uma nota de 0 a 10: ");
        byte notaInformada = scanner.nextByte();
        boolean notaNaoEValida = notaInformada < 0 || notaInformada > 10;
        if (notaNaoEValida){
            while (notaInformada < 0 || notaInformada > 10){
                System.out.print("Por favor insira uma nota valida: ");
                notaInformada = scanner.nextByte();
            }
        }
        scanner.close();
    }
}
