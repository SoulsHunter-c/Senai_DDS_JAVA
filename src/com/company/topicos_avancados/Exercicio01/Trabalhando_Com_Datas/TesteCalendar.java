package com.company.topicos_avancados.Exercicio01.Trabalhando_Com_Datas;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
public class TesteCalendar {
    public static void main(String[] args) {
        Calendar c1 = new GregorianCalendar();

        c1.set(Calendar.DAY_OF_MONTH,31);
        c1.set(Calendar.MONTH, 0);
        c1.set(Calendar.YEAR,2010);
        c1.set(Calendar.MINUTE, 30);
        c1.set(Calendar.SECOND,0);

        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(formatador.format(c1.getTime()));

        c1.add(Calendar.MONTH,1);

        System.out.println(formatador.format(c1.getTime()));
    }
}
