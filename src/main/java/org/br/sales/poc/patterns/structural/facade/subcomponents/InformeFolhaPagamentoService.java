package org.br.sales.poc.patterns.structural.facade.subcomponents;

import org.br.sales.poc.patterns.structural.facade.model.Rendimento;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

public class InformeFolhaPagamentoService {

    public List<Rendimento> getFolhasPAgamento(String cpf, int anoExercicio) {

        Rendimento rendimento = Rendimento.builder()
                .cnpj("741.852.963/0001-2")
                .description("folha de pagamento")
                .amountInit(BigDecimal.ZERO)
                .amountEnd(BigDecimal.TEN)
                .build();

        return Collections.singletonList(rendimento);
    }
}
