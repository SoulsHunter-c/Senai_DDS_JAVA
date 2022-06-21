package com.company.novidades_do_java_separador_de_digito_em_literais_numericos.try_with_resources_e_multi_catch;

public class SalvarAluno {

    public static void salvar(String nome, String idade) throws NegocioException {
        if(nome == null || nome.trim().equals("")){
            throw new NegocioException("Impossivel salvar aluno sem nome!");
        }

        int i = Integer.parseInt(idade);
        System.out.println("Salvando...");
    }
}
