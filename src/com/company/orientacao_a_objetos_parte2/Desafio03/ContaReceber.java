package com.company.orientacao_a_objetos_parte2.Desafio03;
public class ContaReceber extends Conta{
    public ContaReceber(Cliente telecom, String s, double v, String s1) {
    }

    public ContaReceber() {

    }

    public void Cancelar(){
        if(getValor() < 50000){
            super.cancelar();
        }else{
            System.out.println("Nao podemos cancelar a conta " + getDescricao() + " pois ela possui valor inferior a 50.000.");
        }
    }

    public void receber() {
    }
}
