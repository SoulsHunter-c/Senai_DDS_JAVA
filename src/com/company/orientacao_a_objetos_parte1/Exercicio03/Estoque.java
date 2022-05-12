package com.company.orientacao_a_objetos_parte1.Exercicio03;
public class Estoque {
    Produto[] produtos;
    private int quantidadeTotal;

    void listarProdutos(){
        System.out.println("Produtos em estoque\n---------------------------");
        for (int i = 0; i < produtos.length; i++){
            produtos[i].dsecrever();
        }
    }
    void quantidadeTotalDeProdutosEmEstoque(){
        for(int i = 0; i < produtos.length; i++){
            this.quantidadeTotal += produtos[i].quantidade;
        }
        System.out.println("Quantidade Total de produtos no estoque: " + quantidadeTotal);
    }
}
