package com.company.topicos_avancados.Exercicio01.Trabalhando_Com_Numeros.Desafio01;
/*
Desenvolva um programa que:
Recebe como parâmetro do usuário o valor de um produto do tipo double.
Instancia um objeto do tipo BigDecimal atribuindo o valor double a ele.
Calcula 10% do valor usando os métodos disponíveis na classe BigDecimal.
Formata o novo valor calculado para o padrão monetário (R$).
Exibe na tela o valor calculado e formatado.
 */

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal valorDesejado;
        DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
        System.out.print("Insira o valor desejado: ");
        valorDesejado = scanner.nextBigDecimal();
        valorDesejado = valorDesejado.divide(BigDecimal.TEN);;
        System.out.println("Valor de 10%:\n " + formatador.format(valorDesejado));

    }
}
