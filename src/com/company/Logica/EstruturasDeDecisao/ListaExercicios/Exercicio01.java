package com.company.Logica.EstruturasDeDecisao.ListaExercicios;
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primero numero: ");
        double primeiroNumero = scanner.nextDouble();
        System.out.print("Insira o segundo numero: ");
        double segundoNumero = scanner.nextDouble();
        if(verificaMaior(primeiroNumero,segundoNumero)){
            System.out.println("O numero " + primeiroNumero + " é o maior!");
        }else if(verificaIgualdade(primeiroNumero,segundoNumero)) {
            System.out.println("Os numeros infomados sao iguais!");
        }else{
            System.out.println("O numero " + segundoNumero + " é o maior");
        }
        scanner.close();
    }
    private static boolean verificaMaior(double primeiroNumero , double segundoNumro){
        return primeiroNumero > segundoNumro;
    }
    private static boolean verificaIgualdade(double primeiroNumero , double segundoNumero){
        return primeiroNumero == segundoNumero;
    }
}
