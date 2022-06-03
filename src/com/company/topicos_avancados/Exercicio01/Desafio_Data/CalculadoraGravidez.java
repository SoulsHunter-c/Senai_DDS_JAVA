package com.company.topicos_avancados.Exercicio01.Desafio_Data;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class CalculadoraGravidez {
    private Date dataUltimoPeriodoMenstrual;
    public CalculadoraGravidez(Date dataUltimoPeriodoMenstrual) {
        this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;
    }
    private Calendar converterDateParaCalendar(Date data) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(data);
        return calendar;
    }
    public Date calcularDataEstimadaConcepcao() {
        Calendar dataConcepcao = converterDateParaCalendar(dataUltimoPeriodoMenstrual);
        dataConcepcao.add(Calendar.WEEK_OF_YEAR, 2);
        Date dataConcecao1 = dataConcepcao.getTime();
        return dataConcecao1;
        // implementar cálculo de data estimada da concepção
        // 2 semanas após a data do último período menstrual
    }
    public Date calcularDataEstimadaParto() {
        Calendar dataDeParto = converterDateParaCalendar(dataUltimoPeriodoMenstrual);
        dataDeParto.add(Calendar.WEEK_OF_YEAR, 40);
        Date dataDeParto1 = dataDeParto.getTime();
        return dataDeParto1;
    }
}