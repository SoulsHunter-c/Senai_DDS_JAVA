package com.company.topicos_avancados.Exercicio01.metodos_equals_e_hashCode;

import java.util.Set;

public class TesteSetHashSet2 {
    public static void main(String[] args) {
        Set<Aluno> alunos = SimuladorBancoDeDados.buscarAlunos();

        //de alguma forma, sorteia o nome do aluno e constroi o objeto Aluno

        Aluno alunoSorteado = new Aluno("Maria");

        if(alunos.contains(alunoSorteado)){
            System.out.println("Parabens " + alunoSorteado.getNome() + "! Voce ganhou um brinde!");
        }else{
            System.out.println("Aluno nao cadastrado");
        }
    }
}
