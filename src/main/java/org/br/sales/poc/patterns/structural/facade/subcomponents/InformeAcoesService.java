package org.br.sales.poc.patterns.structural.facade.subcomponents;

import org.br.sales.poc.patterns.structural.facade.model.Rendimento;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class InformeAcoesService {

    public List<Rendimento> getAcoes(String cpf, int anoExercicio) {

        Rendimento rendimento1 = Rendimento.builder()
                .cnpj("123.45.789/0001-0")
                .description("Acão 1")
                .amountInit(BigDecimal.ONE)
                .amountEnd(BigDecimal.TEN)
                .build();
        Rendimento rendimento2 = Rendimento.builder()
                .cnpj("987.654.321/0002-0")
                .description("Ação 2")
                .amountInit(BigDecimal.valueOf(15l))
                .amountEnd(BigDecimal.valueOf(50l))
                .build();

        return Arrays.asList(rendimento1, rendimento2);
    }
}
