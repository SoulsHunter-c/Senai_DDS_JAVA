package com.company.orientacao_a_objetos_parte2.exercicio_interface01;
public class CorretoraSeguro {
    public void realizaProposta(Seguravel seguravel){
        System.out.print("Deseja realizar o seguro? ");
        seguravel.calcularValorApolice();
    }
}
