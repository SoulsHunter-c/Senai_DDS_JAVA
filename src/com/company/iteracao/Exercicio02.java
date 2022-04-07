package com.company.iteracao;
public class Exercicio02 {
    private static final byte DIVISOR = 3;

    public static void main(String[] args) {
        Integer[] numeros = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        Integer i = 0;
        while (numeros[i] < numeros.length) {
            boolean eDivisivelPeloDivisor = numeros[i] % DIVISOR == 0;
            if (eDivisivelPeloDivisor) {
                System.out.println("O numero " + numeros[i] + " é divisivel por 3");
            }
            i++;
        }
    }
}