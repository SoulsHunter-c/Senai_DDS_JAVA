package com.company.Logica.metodos;
import java.util.Scanner;
/*
Crie um programa que peça dois números do usuário e também qual a operação ele deseja fazer - adição ou subtração.
 Para cada operação, você deve construir um método que realize a mesma, ou seja, teremos um método para adição,
 que vai receber dois números como parâmetros e retornar o resultado da soma entre eles, e outro método para subtração.
Fique a vontade para implementar multiplicação e divisão também.
 */
public class Exercicio01 {
    static int operacaoSelecionada = 0;
    static double resultadoDaOperacao = 0.0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double[] numeros = {0.0,0.0};
        perguntaNumeros(numeros, scanner);
        perguntaOperacao(scanner);
        realizaOperacao(numeros,operacaoSelecionada);
        retornaResultado(resultadoDaOperacao);
        scanner.close();
    }
    static void perguntaNumeros(Double[] numeros, Scanner scanner){
        for(int i=0; i < numeros.length; i++){
            System.out.print("Insira o " + i + " número: ");
            numeros[i] = scanner.nextDouble();
        }
    }
    static void perguntaOperacao (Scanner scanner){
        System.out.println("Insira a operação desejada:\n[1]-SOMA\n[2]-SUBTRAÇÃO\n[3]-DIVISÃO\n[4]-MULTIPLICAÇÃO");
        operacaoSelecionada = scanner.nextInt();
        while(operacaoSelecionada > 4){
            System.err.println("Escolha uma operação valida: ");
            operacaoSelecionada = scanner.nextInt();
        }
    }
    static void realizaOperacao (Double numeros[], int operacaoSelecionada){
        switch (operacaoSelecionada){
            case 1 -> resultadoDaOperacao = numeros[0] + numeros[1];
            case 2 -> resultadoDaOperacao = numeros[0] - numeros[1];
            case 3 -> resultadoDaOperacao = numeros[0] / numeros[1];
            case 4 -> resultadoDaOperacao = numeros[0] * numeros[1];
        }
    }
    static void retornaResultado (double resultadoDaOperacao){
        System.out.println("O resultado da operação é: " + resultadoDaOperacao);
    }
}