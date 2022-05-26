package com.company.orientacao_a_objetos_parte2.exercicio_interface01;
public class Imovel implements Seguravel{
    String descicao;
    double preco;

    public Imovel(String descicao, double preco) {
        this.descicao = descicao;
        this.preco = preco;
    }

    public void obterDesricao() {
        System.out.println("Descricao do produto: " + this.descicao);
    }

    public void calcularValorApolice() {
        System.out.println("Preço final do produto: " + this.preco * 5);
    }
}
