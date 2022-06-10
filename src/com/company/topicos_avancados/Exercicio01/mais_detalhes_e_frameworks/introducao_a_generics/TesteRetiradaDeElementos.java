package com.company.topicos_avancados.Exercicio01.mais_detalhes_e_frameworks.introducao_a_generics;

import java.util.ArrayList;
import java.util.List;

public class TesteRetiradaDeElementos {
    public static void main(String[] args) {
        List<Funcionario> nomes = new ArrayList<>();
        nomes.add(new Funcionario("Ricardo"));

        Funcionario f = RetirarElementos.recuperarPrimeiro(nomes);
        System.out.println(f.getNome());
    }

}
