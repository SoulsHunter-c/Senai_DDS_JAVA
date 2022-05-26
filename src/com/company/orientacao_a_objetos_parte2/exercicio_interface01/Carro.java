package com.company.orientacao_a_objetos_parte2.exercicio_interface01;
public class Carro implements Seguravel{
    String descricao;
    double preco;

    public Carro(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public void obterDesricao() {
        System.out.println("Descrição do produto: " + this.descricao);
    }
    public void calcularValorApolice() {
        System.out.println("O preço final é: " + this.preco * 5);
    }
}
