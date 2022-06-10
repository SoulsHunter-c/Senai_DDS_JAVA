package com.company.topicos_avancados.Exercicio01.mais_detalhes_e_frameworks.introducao_a_generics;

public class TesteGaveta {
    public static void main(String[] args) {
        Gaveta<String> gaveta = new Gaveta<>();
        gaveta.colocar("Livro de Java");
        System.out.println(gaveta.retirarPrimeiro());
        Gaveta<Integer> gavetaNumero = new Gaveta<>();
        gavetaNumero.colocar(4);
        System.out.println(gavetaNumero.retirarPrimeiro() + 2);
    }
}
