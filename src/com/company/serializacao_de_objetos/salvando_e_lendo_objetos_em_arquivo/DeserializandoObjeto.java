package com.company.serializacao_de_objetos.salvando_e_lendo_objetos_em_arquivo;

import com.company.serializacao_de_objetos.salvando_e_lendo_objetos_em_arquivo.model.Pessoa;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class DeserializandoObjeto {
    public static void main(String[] args) {
        try (ObjectInput in = new ObjectInputStream(new FileInputStream(("joao.obj")))){
            Pessoa p = (Pessoa) in.readObject();
            System.out.println("Nome: " + p.getNome());
            System.out.println("Idade: " + p.getIdade());
            System.out.println("Profissao: " + p.getProfissao());
        } catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }catch (ClassNotFoundException e){
            System.out.println("Erro convertendo para a classe Pessoa");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
