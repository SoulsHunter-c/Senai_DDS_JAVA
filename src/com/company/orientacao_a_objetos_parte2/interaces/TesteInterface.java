package com.company.orientacao_a_objetos_parte2.interaces;
public class TesteInterface {
    public static void main(String[] args) {
        Imprimivel i = new NotaFiscal(1234);
        i.imprimir();
        EnviavelEmail e = (EnviavelEmail) i;
        e.enviar("filipealvezvaz@gmail.com");
        NotaFiscal n = (NotaFiscal) e;
        n.adicionarPedido("caixa de leite");
    }
}
