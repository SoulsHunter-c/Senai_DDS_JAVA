package com.company.topicos_avancados.Exercicio01.Desafio_Data;
/*

A data estimada da concepção é igual a data do último período menstrual mais 2 semanas.

A data estimada do parto é igual a data do último período menstrual mais 40 semanas.

Dica 1: para somar um número de semanas à uma data, use:
variavelDoTipoCalendar.add(Calendar.WEEK_OF_YEAR, numeroDeSemanas);

Dica 2: Use o método converterDateParaCalendar(), que já está pronto, para converter o tipo Date para Calendar. Você vai precisar disso!
Veja que para usar a classe CalculadoraGravidez, deve-se instanciá-la passando como parâmetro
do construtor a data do último período menstrual e depois basta chamar os métodos que calcula as datas desejadas.

A classe Principal recebe a entrada do teclado do usuário, converte o texto para o tipo Date,
instancia um objeto da classe CalculadoraGravidez e realiza os cálculos, exibindo os resultados na tela. Essa classe está pronta para você,
com exceção do método converterEmData(), que você deve implementar.
O método converterEmData() recebe um parâmetro do tipo String e deve retornar um tipo Date.
Use o que aprendeu na aula sobre datas para converter String em Date no formato "dd/MM/yyyy".
 */
import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Locale;
public class Principal {
    public static void main(String args[]) {
        new Principal();
    }
    public Principal() {
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.println("Data do último período menstrual (dd/mm/aaaa):");
            String ultimoPeriodoMenstrual = entrada.nextLine();
            Date dataUltimoPeriodoMenstrual = this.converterEmData(ultimoPeriodoMenstrual);
            CalculadoraGravidez calculadora = new CalculadoraGravidez(dataUltimoPeriodoMenstrual);
            Date dataEstimadaConcepcao = calculadora.calcularDataEstimadaConcepcao();
            System.out.println("Data estimada da concepção: "
                    + this.formatarData(dataEstimadaConcepcao));
            Date dataEstimadaParto = calculadora.calcularDataEstimadaParto();
            System.out.println("Data estimada para parto: "
                    + this.formatarData(dataEstimadaParto));
        } catch (ParseException pe) {
            System.out.println("Informe uma data no padrão dd/mm/aaaa.");
        }
    }
    private String formatarData(Date data) {
        DateFormat formatador = new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' yyyy",
                new Locale("pt", "br"));
        return formatador.format(data);
    }
    private Date converterEmData(String texto) throws ParseException {
        DateFormat formatador2 = new SimpleDateFormat("dd/MM/yyyy");
        Date ultimaMestruacao = formatador2.parse(texto);
        return ultimaMestruacao;
    }
}