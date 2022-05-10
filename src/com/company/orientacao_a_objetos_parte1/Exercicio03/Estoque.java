package com.company.orientacao_a_objetos_parte1.Exercicio03;
import java.util.ArrayList;
public class Estoque {
    ArrayList<String> produtos = new ArrayList<>();
    private void listarProdutos(ArrayList<String> produtos){
        for (int i=0; i<produtos.size(); i++){
            System.out.println(produtos.get(i));
        }
    }
}
