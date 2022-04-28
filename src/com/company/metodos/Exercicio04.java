package com.company.metodos;
import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        Integer n = recebeEntrada(scanner);
        escreveNatela(n,i);
    }
    static public void escreveNatela(Integer n, int i){
        if(n >= ++i){
            if(n > i){
                System.out.println(n);
            }
        }
    }
    static public Integer recebeEntrada(Scanner scanner){
        System.out.println("Insira o numero desejado: ");
        return  scanner.nextInt();
    }
}

