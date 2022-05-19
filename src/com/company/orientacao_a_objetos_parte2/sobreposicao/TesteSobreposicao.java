package com.company.orientacao_a_objetos_parte2.sobreposicao;

import java.util.Date;

public class TesteSobreposicao {
    public static void main(String[] args) {
        ProdutoPerecivel pp = new ProdutoPerecivel();
        pp.dataValidade = new Date();
        pp.dsecricao = "Carne";
        pp.identificar();
    }
}
