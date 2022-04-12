package org.br.sales.poc.patterns.structural.facade.servicefacade;

import org.br.sales.poc.patterns.structural.facade.model.InformeRendimento;
import org.br.sales.poc.patterns.structural.facade.subcomponents.InformeAcoesService;
import org.br.sales.poc.patterns.structural.facade.subcomponents.InformeEmprestimosSerivce;
import org.br.sales.poc.patterns.structural.facade.subcomponents.InformeFinanciamentoService;
import org.br.sales.poc.patterns.structural.facade.subcomponents.InformeFolhaPagamentoService;

public class InformeRendimentoFacade {

    private InformeAcoesService informeAcoesService;
    private InformeEmprestimosSerivce informeEmprestimosSerivce;
    private InformeFinanciamentoService informeFinanciamentoService;
    private InformeFolhaPagamentoService informeFolhaPagamentoService;
    private int anoExercicio;

    public InformeRendimentoFacade(int anoExercicio) {
        this.informeAcoesService = new InformeAcoesService();
        this.informeEmprestimosSerivce = new InformeEmprestimosSerivce();
        this.informeFinanciamentoService = new InformeFinanciamentoService();
        this.informeFolhaPagamentoService = new InformeFolhaPagamentoService();
        this.anoExercicio = anoExercicio;
    }

    public InformeRendimento getInforme(String cpf) {

        InformeRendimento informeRendimento = InformeRendimento.builder()
                .nome("João")
                .anoExercicio(this.anoExercicio)
                .cpf(cpf)
                .rendimentosAcoes(this.informeAcoesService.getAcoes(cpf, anoExercicio))
                .rendimentosEmprestimos(this.informeEmprestimosSerivce.getEmprestimos(cpf, anoExercicio))
                .rendimentosFinanciamentos(this.informeFinanciamentoService.getFinanciamentos(cpf))
                .rendimentosFolhaPagamento(this.informeFolhaPagamentoService.getFolhasPAgamento(cpf, anoExercicio))
                .build();

        return informeRendimento;
    }
}
