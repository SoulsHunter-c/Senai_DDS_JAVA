package com.company.orientacao_a_objetos_parte2.enumeracoes;
public class TesteOperacaoEnum {
    public static void main(String[] args) {
        OperacaoAritimetica o1 = OperacaoAritimetica.ADICAO;
        int resualtado1 = o1.operacao(5,3);
        System.out.println("O resultado é: " + resualtado1);
        OperacaoAritimetica o2 = OperacaoAritimetica.SUBTRACAO;
        int resultado2 = o2.operacao(10,5);
        System.out.println("O resultado é: " + resultado2);
    }
}
