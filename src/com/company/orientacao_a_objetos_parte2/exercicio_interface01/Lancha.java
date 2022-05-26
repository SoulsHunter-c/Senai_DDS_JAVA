package com.company.orientacao_a_objetos_parte2.exercicio_interface01;
public class Lancha implements  Seguravel{
    String descricao;
    Double preçoDaLancha;
    int tamanhoDaLancha;

    public Lancha(String descricao, Double preçoDaLancha, int tamanhoDaLancha) {
        this.descricao = descricao;
        this.preçoDaLancha = preçoDaLancha;
        this.tamanhoDaLancha = tamanhoDaLancha;
    }

    public void obterDesricao() {
        System.out.println("A descrição é: " + this.descricao + "\n E o tamanho da lancha é: " + this.tamanhoDaLancha);
    }
    public void calcularValorApolice() {
        double valorSeguro = this.preçoDaLancha * 0.6;
        System.out.println("O valor do seguro fica " + valorSeguro + ", deseja efetivar?");
    }
}
