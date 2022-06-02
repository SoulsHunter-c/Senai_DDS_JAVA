package com.company.topicos_avancados.Exercicio01.Classes_String_StringBuffer_e_StringBuilder;

public class TesteString {
    public static void main(String[] args) {
        String s = "Olá";
        s = s + "Pessoal";
        System.out.println(s);

        StringBuilder sb = new StringBuilder("olá");
        sb.append(" Pessoal!");

        String resultado = sb.toString();
        System.out.println("Com StringBuilder: " + resultado);
    }
}
