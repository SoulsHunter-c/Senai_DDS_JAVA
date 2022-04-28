package com.company.metodo;
import java.util.Scanner;

public class Exercicio01melhor {
    public static void main(String[] args) {
        Integer i = 0;
        Scanner scanner = new Scanner(System.in);
        Double multiplicando = recebeMultiplicando(scanner);
        realizaTabuadaDoMultiplicando(multiplicando,i);

    }
    static void realizaTabuadaDoMultiplicando(Double multiplicando, Integer i){
        System.out.println(multiplicando + " * " + i + " = " + (realizamultiplicacao(multiplicando,i)));
        if(++i <= 10){
            realizaTabuadaDoMultiplicando(multiplicando,i);
        }
    }
    static Double realizamultiplicacao(Double multiplicando, Integer i){
        return multiplicando * i;
    }
    static Double recebeMultiplicando(Scanner scanner){
        System.out.print("Insira o multiplicando: ");
        return scanner.nextDouble();
    }
}
