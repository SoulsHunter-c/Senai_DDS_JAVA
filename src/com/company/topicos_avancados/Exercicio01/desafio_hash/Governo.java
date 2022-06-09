package com.company.topicos_avancados.Exercicio01.desafio_hash;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
public class Governo {
    private Map<String, List<Politico>> partidosPoliticos;
    public Governo() {
        this.partidosPoliticos = new HashMap<String, List<Politico>>();
    }
    public void adicionarPolitico(String partidoPolitico, Politico politico) {
        List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
        if (politicos == null) {
            politicos = new ArrayList<Politico>();
        }
        politicos.add(politico);
        this.partidosPoliticos.put(partidoPolitico, politicos);
    }
    public BigDecimal calcularGastosComSalario(String partidoPolitico) {
        BigDecimal gastoComSalario = new BigDecimal(0);
        List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
        if(politicos != null){
            for (Politico p1 : politicos){
               gastoComSalario = gastoComSalario.add(p1.getCargo().getSalario());
            }
        }
        return gastoComSalario;
    }
    public BigDecimal calcularGastosComSalarioParaCargo(Cargo cargo, String partidoPolitico) {
        BigDecimal gastoComSalarioDeCargo = new BigDecimal(0);
        List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
        if(politicos != null){
            for(Politico p2 : politicos){
                if(p2.getCargo() == cargo){
                    gastoComSalarioDeCargo = gastoComSalarioDeCargo.add(p2.getCargo().getSalario());
                }
            }
        }
        return gastoComSalarioDeCargo;
    }
}