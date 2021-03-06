package com.company.novidades_do_java_separador_de_digito_em_literais_numericos.switch_case_com_string;

public class SwitchCaseComString {

    public static void main(String[] args) {
        String carro = args.length > 0 ? args[0] : "";
        /*
        if (carro.equals("Audi")){
            System.out.println("Alemao");
        }else if (carro.equals("Ferrari")){
            System.out.println("Italiano");
        }*/
        switch (carro) {
            case "Audi" -> System.out.println("Alemao");
            case "Ferrari" -> System.out.println("Italiano");
            case "Honda" -> System.out.println("Japones");
            default -> System.out.println("Não informou nenhum carro!");
        }
    }
}
