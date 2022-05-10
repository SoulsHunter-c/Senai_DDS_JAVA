package com.company.Logica.EstruturasDeDecisao;
import java.util.Scanner;
public class Exercicio02 {
    private static final double OITENTA_POR_CENTO = 0.8;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a meta de faturamento atual da empresa: ");
        double metaDeFaturamentoAnual = scanner.nextDouble();
        System.out.print("Insira o faturamento real da empresa; ");
        double faturamentoRealDaEmpresa = scanner.nextDouble();
        System.out.print("Insira a sua media salarial: ");
        double mediaSalarial = scanner.nextDouble();
        if(recebeBonusTotal(faturamentoRealDaEmpresa,metaDeFaturamentoAnual)){
            System.out.println("O seu salario será de: " + salarioComBonusTotal(mediaSalarial));
        }else if(recebe80PorCentoDeBonus(faturamentoRealDaEmpresa,metaDeFaturamentoAnual)){
            System.out.println("O seu salario será de: " + salarioCom80PorCentoDeBonus(mediaSalarial));
        }else{
            System.out.println("O seu salario será de: " + mediaSalarial);
        }
        scanner.close();
    }
    private static double oitentaPorcentoDaMeta(double metaDeFaturamentoAneual){
        return metaDeFaturamentoAneual * OITENTA_POR_CENTO;
    }
    private static double salarioComBonusTotal(double mediaSalarial){
        return mediaSalarial + mediaSalarial;
    }
    private static double salarioCom80PorCentoDeBonus(double mediaSalarial){
        return (mediaSalarial * OITENTA_POR_CENTO) + mediaSalarial;
    }
    private static boolean recebeBonusTotal(double faturamentoRealDaEmpresa , double metaDeFaturamentoAnual){
        return faturamentoRealDaEmpresa >= metaDeFaturamentoAnual;
    }
    private static boolean recebe80PorCentoDeBonus(double faturamentoRealDaEmpresa , double metaDeFaturamentoAnual){
        return faturamentoRealDaEmpresa < metaDeFaturamentoAnual && faturamentoRealDaEmpresa > oitentaPorcentoDaMeta(metaDeFaturamentoAnual);
    }
}
