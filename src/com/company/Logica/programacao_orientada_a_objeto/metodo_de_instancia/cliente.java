package com.company.Logica.programacao_orientada_a_objeto.metodo_de_instancia;
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
