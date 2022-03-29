package com.company.EstruturasDeDecisao.ListaExercicios;
import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro lado do triangulo: ");
        double primeiroLado = scanner.nextDouble();
        System.out.print("Insira o segundo lado do triangulo: ");
        double segundoLado = scanner.nextDouble();
        System.out.print("Insira o terceiro lado do triangulo: ");
        double terceiroLado = scanner.nextDouble();
        if(verificaSePodeTriangulo(primeiroLado,segundoLado,terceiroLado)){
            System.out.println("Pode ser um triangulo!");
            if(verificaSeEquilatero(primeiroLado,segundoLado,terceiroLado)){
                System.out.println("Tringulo Equilatero");
            }else if(verificaSeEscaleno(primeiroLado,segundoLado,terceiroLado)){
                System.out.println("Triangulo Escaleno");
            }else if(verificaSeIsoceles(primeiroLado,segundoLado,terceiroLado)){
                System.out.println("Triangulo Isoceles");
            }
            scanner.close();
        }
    }
    private static boolean verificaSePodeTriangulo(double primeiroLado, double segundoLado, double terceiroLado){
        return (primeiroLado + segundoLado) > terceiroLado && (primeiroLado + terceiroLado) > segundoLado && (segundoLado + terceiroLado) > segundoLado;
    }
    private static boolean verificaSeEquilatero(double primeiroLado, double segundoLado, double terceiroLado){
        return primeiroLado == segundoLado && primeiroLado == terceiroLado;
    }
    private static boolean verificaSeEscaleno(double primeiroLado, double segundoLado, double terceiroLado){
        return primeiroLado != segundoLado && primeiroLado != terceiroLado && segundoLado != terceiroLado;
    }
    private static boolean verificaSeIsoceles(double primeiroLado, double segundoLado, double terceiroLado){
        return primeiroLado == segundoLado || primeiroLado == terceiroLado || segundoLado == terceiroLado;
    }
}
