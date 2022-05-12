package com.company.orientacao_a_objetos_parte2.o_objeto_this;

import com.company.orientacao_a_objetos_parte1.composicao_de_obejtos.Proprietario;

public class Carro {
    String fabeicante;
    String modelo;
    String cor;
    int anoDeFabricacao;
    boolean biCombustivel;
    Proprietario dono;
    void alterarModelo(String modelo){
        if(modelo != null){
            this.modelo = modelo;
        }
    }
    void ligar(){
        if(modelo != null){
            System.out.println("Ligando o carro: " + modelo);
        }
    }
}
