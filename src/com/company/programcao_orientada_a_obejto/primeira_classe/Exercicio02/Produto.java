package com.company.programcao_orientada_a_obejto.primeira_classe.Exercicio02;
/*
Faça exatamente como no exercício passado, só que agora torne o método, que verifica a necessidade de repor estoque,
 como um método de instância.
Lembre-se de que ele não precisará mais receber parâmetros, pois, usará as próprias variáveis de instância
da classe Produto.
 */
public class Produto {
    String nome;
    int quantidadeEmEstoque;

    static int VALOR_MINIMO_PARA_REPOSICAO = 10;

    Boolean precisaReporEstoque(){
        return quantidadeEmEstoque <= VALOR_MINIMO_PARA_REPOSICAO;
    }
}
