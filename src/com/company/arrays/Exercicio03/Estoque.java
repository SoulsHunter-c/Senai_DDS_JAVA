package com.company.arrays.Exercicio03;
public class Estoque {
    Produto[] produtos;
    private int quantidadeTotal;

    void listarProdutos(){
        System.out.println("Produtos em estoque\n---------------------------");
        for (int i = 0; i < produtos.length; i++){
            produtos[i].dsecreverProdutos();
        }
    }
    void quantidadeTotalDeProdutosEmEstoque(){
        for(int i = 0; i < produtos.length; i++){
            quantidadeTotal += produtos[i].quantidade;
        }
        System.out.println("Quantidade Total de produtos no estoque: " + quantidadeTotal);
    }
}
