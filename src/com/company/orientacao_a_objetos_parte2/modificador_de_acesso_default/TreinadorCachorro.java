package com.company.orientacao_a_objetos_parte2.modificador_de_acesso_default;
public class TreinadorCachorro {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        DonoCachorro donoCachorro = new DonoCachorro();
        cachorro.setNome("bethoven");
        donoCachorro.ensinaCachorroSentar(cachorro);
    }
}
