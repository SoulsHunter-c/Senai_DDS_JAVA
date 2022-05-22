package com.company.orientacao_a_objetos_parte2.classes_abstratas;

public class ProdutoPericivel extends Produto{
    String dataValidade;
    public void imprimirDescricao(){
        System.out.println("Descricao: " + super.getDescricao());
    }
}
