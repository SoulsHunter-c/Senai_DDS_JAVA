package com.company.EstruturasDeDecisao.ListaExercicios;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class Exercicio26 {
    private static final byte VINTE_LITROS = 20;
    private static final double PRECO_GASOLINA_ATE_20_LITROS = 2.4;
    private static final double PRECO_GASOLINA_ACIMA_20_LITROS = 2.35;
    private static final double PRECO_ALCOOL_ATE_20_LITROS = 1.843;
    private static final double PRECO_ALCOOL_ACIMA_20_LITROS = 1.805;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precoDoAbastecimento = 0;

        System.out.println("                   PREÇO");
        System.out.println("(A)-ÁCOOL         R$1,90");
        System.out.println("(G)-GASOLINA      R$2,50");
        System.out.print("Selecione o combustivel desejado(G/F): ");
        char tipoDeCombustivel = scanner.next().charAt(0);
        System.out.print("Informe quatos litros deseja abastecer:");
        double litrosParaAbastecer = scanner.nextDouble();
        if(abastecimentoAte20Litros(litrosParaAbastecer)){
            switch (tipoDeCombustivel){
                case 'G','g' -> precoDoAbastecimento = litrosParaAbastecer * PRECO_GASOLINA_ATE_20_LITROS;
                case 'A','a' -> precoDoAbastecimento = litrosParaAbastecer * PRECO_ALCOOL_ATE_20_LITROS;
            }
        }else{
            switch (tipoDeCombustivel){
                case 'G','g' -> precoDoAbastecimento = litrosParaAbastecer * PRECO_GASOLINA_ACIMA_20_LITROS;
                case 'A','a' -> precoDoAbastecimento = litrosParaAbastecer * PRECO_ALCOOL_ACIMA_20_LITROS;
            }
        }
        System.out.println("O abastecimento concluido:\nLitros Abastecidos: " + litrosParaAbastecer + "\nPreço a se pagar: " + precoDoAbastecimento);
        scanner.close();
    }
    private static boolean abastecimentoAte20Litros(double litrosParaAbastecer){
        return litrosParaAbastecer <= VINTE_LITROS;
    }
}
