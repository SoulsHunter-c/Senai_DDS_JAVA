package com.company.novidades_do_java_separador_de_digito_em_literais_numericos.ExemploDiamond;

import java.util.*;

public class ExemploDiamond {
    public static void main(String[] args) {
        List<String> nomeClientes = new ArrayList<>();
        nomeClientes.add("Joao");
        nomeClientes.add("Maria");

        Map<String, Set<String>> carrosPorMontadora = new HashMap<>();
        carrosPorMontadora.put("Chevrolet", new HashSet<String>());
        carrosPorMontadora.get("Chevrolet").add("Cruze");

    }
}
