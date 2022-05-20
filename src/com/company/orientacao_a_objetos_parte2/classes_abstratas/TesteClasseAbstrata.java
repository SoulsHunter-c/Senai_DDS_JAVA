package com.company.orientacao_a_objetos_parte2.classes_abstratas;
public class TesteClasseAbstrata {
    public static void main(String[] args) {
        Produto p = new ProdutoPericivel();
        p.descricao = "CAIXA DE LEITE";

        ProdutoPericivel pp = (ProdutoPericivel) p;
        pp.dataValidade = "10/03/22";
        p.imprimirDescricao();
    }
}
