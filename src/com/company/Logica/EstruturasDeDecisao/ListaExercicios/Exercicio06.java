package com.company.Logica.EstruturasDeDecisao.ListaExercicios;
import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro numero: ");
        double primeiroNumero = scanner.nextDouble();
        System.out.print("Insira o segundo numero: ");
        double segundoNumero = scanner.nextDouble();
        System.out.print("Insira o terceiro numero: ");
        double terceiroNumero = scanner.nextDouble();
        if(verificaPrimeiro(primeiroNumero,segundoNumero,terceiroNumero)){
            System.out.println("O maior numero informado foi " + primeiroNumero);
        }else if(verificaSegundo(primeiroNumero,segundoNumero,terceiroNumero)){
            System.out.println("O maior numero informado foi " + segundoNumero);
        }else{
            System.out.println("O maior numero informado foi " + terceiroNumero);
        }
        scanner.close();
    }
    private static boolean verificaPrimeiro(double primeiroNumero , double segundoNumero , double terceiroNumero){
        return primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero;
    }
    private static boolean verificaSegundo(double primeiroNumero , double segundoNumero , double terceiroNumero){
        return segundoNumero > primeiroNumero && segundoNumero > terceiroNumero;
    }
    private static boolean verificaTerceiro(double primeiroNumero , double segundoNumero , double terceiroNumero){
        return terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero;
    }
}
