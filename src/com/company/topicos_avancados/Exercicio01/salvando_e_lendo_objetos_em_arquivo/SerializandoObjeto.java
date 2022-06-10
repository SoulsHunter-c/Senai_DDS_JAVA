package com.company.topicos_avancados.Exercicio01.salvando_e_lendo_objetos_em_arquivo;

import com.company.topicos_avancados.Exercicio01.salvando_e_lendo_objetos_em_arquivo.model.Pessoa;

import java.io.*;

public class SerializandoObjeto {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Joao Silva");
        p.setIdade(25);
        p.setProfissao("Motorista");

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("joao.obj"))) {
            out.writeObject(p);
            System.out.println("Objeto salvo com sucesso");
        }catch (IOException e){
            System.out.println("Erro salvando objeto. " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
