package com.company.orientacao_a_objetos_parte2.interaces;
public class NotaFiscal implements  Imprimivel, EnviavelEmail {
    private int numero;
    public NotaFiscal(int numero) {
        this.numero = numero;
    }

    public void enviar(String email) {
        System.out.println("Enviando a nota de numero: " + numero + " para o email: " + email);
    }
    public void imprimir() {
        System.out.println("Vamos imprimir essa nota fiscal de numero: " + numero);
    }
    public void adicionarPedido(String produto){

    }
}
