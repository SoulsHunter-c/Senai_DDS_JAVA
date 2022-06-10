package com.company.topicos_avancados.Exercicio01.mais_detalhes_e_frameworks.introducao_a_generics;

import java.util.List;

public class RetirarElementos {

    public static <T> T recuperarPrimeiro(List<T> list) {
        return list.get(0);
    }
}
