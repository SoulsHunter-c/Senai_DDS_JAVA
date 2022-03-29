package com.company.EstruturasDeDecisao.ListaExercicios;
import java.util.Scanner;
public class Exercicio28 {
    private static final double FILE_MENOS_QUE_5 = 4.90;
    private static final double FILE_MAIOR_QUE_5 = 5.80;
    private static final double ALCATRA_MENOS_QUE_5 = 4.90;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("                     ATÉ 5 KG            ACIMA DE 5KG");
        System.out.println("(1)FILE DUPLO      R$4,90 por KG         R$5,80 por KG");
        System.out.println("(2)ALCATRA         R$5,90 por KG         R$6,80 por KG");
        System.out.println("(3)PICANHA         R$6,90 por KG         R$7,80 por KG");
        System.out.print("Escolha a carne desejada: ");
        byte carneEscolhida = scanner.nextByte();
        System.out.print("Escolha a quantidade desejada em KG: ");
        double quilosDesejados = scanner.nextByte();
        System.out.println("Escolha a forma de pagamento:\n(1)-CARTAO TABAJARA\n(2)-OUTRO");
        byte formaDePagamento = scanner.nextByte();
        if(quilosDesejados > 5){

        }
    }
}
