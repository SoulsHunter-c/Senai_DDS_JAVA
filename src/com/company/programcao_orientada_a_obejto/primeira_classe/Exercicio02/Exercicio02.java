package com.company.programcao_orientada_a_obejto.primeira_classe.Exercicio02;

public class Exercicio02 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.quantidadeEmEstoque = 9;
        produto.nome = "Abobra";

        if(produto.precisaReporEstoque()){
            System.err.println("O estoque preisa ser reabastecido");
        }
    }
}
