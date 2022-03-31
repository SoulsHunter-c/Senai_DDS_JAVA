package com.company.EstruturasDeDecisao.ListaExercicios;
import java.util.Scanner;
public class Exercicio27 {
    private static final double MACA_ACIMA_DE_5KG = 1.5;
    private static final double MACA_ATE_DE_5KG = 1.8;
    private static final double MORANGO_ACIMA_DE_5KG = 2.2;
    private static final double MORANGO_ATE_5KG = 2.5;
    private static final byte QUILOS_PARA_RECEBER_DESCONTO = 8;
    private static final byte PRECO_PARA_RECEBER_DESCONTO = 25;
    private static final double DEZ_POR_CENTO = 0.10;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precoDosMorangos = 0;
        double precoDasMacas = 0;
        double precoFinalDaCompra = 0;

        System.out.println("              ATÉ 5KG       ACIMA DE 5KG");
        System.out.println("MORANGO       R$2,50KG      R$2,20KG");
        System.out.println("MAÇA          R$1,80KG      R$1,50KG");
        System.out.print("Insira a quantidade de Morangos desejados em KG: ");
        byte numeroDeMorangos = scanner.nextByte();
        System.out.print("Insira a quantidade de maças desejadas em KG: ");
        byte numeroDeMacas = scanner.nextByte();
        if(morangosMaiorQue5(numeroDeMorangos)){
            precoDosMorangos = numeroDeMorangos * MORANGO_ACIMA_DE_5KG;
        }else{
            precoDosMorangos = numeroDeMorangos * MORANGO_ATE_5KG;
        }
        if(macasMaiorQue5(numeroDeMacas)){
            precoDasMacas = numeroDeMacas * MACA_ACIMA_DE_5KG;
        }else{
            precoDasMacas = numeroDeMacas * MACA_ATE_DE_5KG;
        }
        if(verificaSeRecebeDesconto(precoDosMorangos,precoDasMacas,numeroDeMorangos,numeroDeMacas)){
            precoFinalDaCompra = (precoDasMacas + precoDosMorangos) - (precoDasMacas + precoDosMorangos) * DEZ_POR_CENTO;
        }else{
            precoFinalDaCompra = precoDosMorangos + precoDosMorangos;
        }
        System.out.println(precoFinalDaCompra);
        scanner.close();
    }
    private static boolean morangosMaiorQue5(byte numeroDeMorangos){
        return numeroDeMorangos > 5;
    }

    private static boolean macasMaiorQue5(byte numeroDeMacas){
        return numeroDeMacas > 5;
    }

    private static boolean quantidadeDeFrutasMaiorQue8(byte numeroDeMacas , byte numeroDeMorangos){
        return numeroDeMacas + numeroDeMorangos >= QUILOS_PARA_RECEBER_DESCONTO;
    }

    private static boolean verificaSeRecebeDesconto(double precoDosMorangos , double precoDasMacas , byte numeroDeMorangos , byte numeroDeMacas){
        return precoDasMacas + precoDosMorangos > PRECO_PARA_RECEBER_DESCONTO && quantidadeDeFrutasMaiorQue8(numeroDeMorangos , numeroDeMacas);
    }
}
