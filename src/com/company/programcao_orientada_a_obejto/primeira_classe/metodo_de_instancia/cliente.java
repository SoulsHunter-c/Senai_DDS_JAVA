package com.company.programcao_orientada_a_obejto.primeira_classe.metodo_de_instancia;
public class cliente {
    String primeiroNome;
    String ultimoNome;
    String telefone;
    String email;

    String obterNomeCompleto(){
        String nomeCompleto = primeiroNome + " " + ultimoNome;
        return nomeCompleto;
    }
}
