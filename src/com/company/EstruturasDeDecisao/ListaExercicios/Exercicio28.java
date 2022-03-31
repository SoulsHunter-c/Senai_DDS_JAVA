package com.company.EstruturasDeDecisao.ListaExercicios;
import java.util.Scanner;
public class Exercicio28 {
    private static final double FILE_ATE_5KG = 4.90;
    private static final double FILE_MAIOR_QUE_5KG = 5.80;
    private static final double ALCATRA_ATE_5KG = 4.90;
    private static final double ALCATRA_MAIOR_QUE_5KG = 6.80;
    private static final double PICANHA_ATE_5KG = 6.90;
    private static final double PICANHA_MAIS_QUE_5KG = 7.80;
    private static final double DESCONTO_PARA_CARTAO = 0.05;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalDaCompra = 0;


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
            switch (carneEscolhida) {
                case 1 -> totalDaCompra = quilosDesejados * FILE_MAIOR_QUE_5KG;
                case 2 -> totalDaCompra = quilosDesejados * ALCATRA_MAIOR_QUE_5KG;
                case 3 -> totalDaCompra = quilosDesejados * PICANHA_MAIS_QUE_5KG;
                default -> System.out.println("Insira um digito valido");
            }
        }else if(quilosDesejados < 5){
            totalDaCompra = switch (carneEscolhida) {
                case 1 -> quilosDesejados * FILE_ATE_5KG;
                case 2 -> quilosDesejados * ALCATRA_ATE_5KG;
                case 3 -> quilosDesejados * PICANHA_ATE_5KG;
                default -> totalDaCompra;
            };
        }
        if(formaDePagamento == 1){
            System.out.println("CARNE ESCOLHIDA:%.2f " + carneEscolhida);
            System.out.println("QUANTIDADE ESCOLHIDA: " + quilosDesejados);
            System.out.println("PREÇO SEM DESCONTO: " + totalDaCompra);
            System.out.printf("PREÇO COM DESCONTO: %.2f",calculaDesconto(totalDaCompra));
        }else{
            System.out.println("CARNE ESCOLHIDA: " + carneEscolhida);
            System.out.println("QUANTIDADE ESCOLHIDA: " + quilosDesejados);
            System.out.println("PREÇO SEM DESCONTO: " + totalDaCompra);
            System.out.printf("PREÇO COM DESCONTO: %.2f" , calculaDesconto(totalDaCompra));
        }
    }
    private static double calculaDesconto(double totalDaCompra){
        return totalDaCompra - (totalDaCompra * DESCONTO_PARA_CARTAO);
    }
}
