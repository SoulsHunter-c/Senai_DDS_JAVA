package com.company.Logica.vetores;

public class Exercicio02 {
    private static final int DIAS_DA_SEMANA = 7;

    public static void main(String[] args) {
        Double[] semanaUm = new Double[]{1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0};
        Double[] semanaDois = new Double[]{1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0};
        Double[] semanaTres = new Double[]{1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0};
        Double[] semanaQuatro = new Double[]{2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0};
        Double[][] mes = new Double[][]{semanaUm, semanaDois, semanaTres, semanaQuatro};
        Double[] faturamentoTotal = new Double[]{0.0, 0.0, 0.0, 0.0};
        double maiorFaturamento = 0;
        int semanaDoMaiorFaturamento = 0;
        for (int y = 0; y < DIAS_DA_SEMANA; y++) {
            faturamentoTotal[0] += mes[0][y];
            faturamentoTotal[1] += mes[1][y];
            faturamentoTotal[2] += mes[2][y];
            faturamentoTotal[3] += mes[3][y];
        }
        for (int i = 0; i < 4; i++) {
            if (faturamentoTotal[i] > maiorFaturamento) {
                maiorFaturamento = faturamentoTotal[i];
                semanaDoMaiorFaturamento = i + 1;
            }
        }
        System.out.println("Maior faturamento: " + maiorFaturamento + "\n" + "Foi na semana: " + semanaDoMaiorFaturamento);
    }
}
