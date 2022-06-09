package com.company.orientacao_a_objetos_parte2.Desafio_Excessoes;
public class Principal {
    public static void main(String[] args) throws OperacaoContaException {
        Fornecedor imobiliaria = new Fornecedor();
        imobiliaria.setNome("Casa & Cia Negócios Imobiliários");


        Fornecedor mercado = new Fornecedor();
        mercado.setNome("Mercado do João");


        Cliente atacadista = new Cliente();
        atacadista.setNome("Triângulo Quadrado Atacadista");


        Cliente telecom = new Cliente();
        telecom.setNome("FoneNet Telecomunicações");


        ContaPagar contaPagar1 = new ContaPagar();
        contaPagar1.setDescricao("Aluguel da matriz");
        contaPagar1.setValor(1230d);
        contaPagar1.setDataVencimento("10/05/2012");
        contaPagar1.setFornecedor(imobiliaria);


        ContaPagar contaPagar2 = new ContaPagar(mercado, "Compras do mês", 390d, "19/05/2012");


        ContaReceber contaReceber1 = new ContaReceber();
        contaReceber1.setDescricao("Desenvolvimento de projeto de logística em Java");
        contaReceber1.setValor(89500d);
        contaReceber1.setDataVencimento("23/05/2012");
        contaReceber1.setCliente(atacadista);
        ContaReceber contaReceber2 = new ContaReceber(telecom, "Manutenção em sistema de conta online", 53200d, "13/05/2012");


        try{
            contaPagar1.pagar();
            imprimirTraco();
            contaReceber1.receber();
            imprimirTraco();
            contaReceber2.cancelar();
            imprimirTraco();
            contaPagar2.cancelar();
        }catch (OperacaoContaException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    private static void imprimirTraco(){
        System.out.println("----------------------------------------");
    }
}