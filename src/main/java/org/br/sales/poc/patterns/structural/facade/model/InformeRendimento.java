package org.br.sales.poc.patterns.structural.facade.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class InformeRendimento {

    private String cpf;
    private int anoExercicio;
    private String nome;
    private List<Rendimento> rendimentosAcoes;
    private List<Rendimento> rendimentosEmprestimos;
    private List<Rendimento> rendimentosFinanciamentos;
    private List<Rendimento> rendimentosFolhaPagamento;

    @Override
    public String toString() {
        return "InformeRendimento{" +
                "\ncpf='" + cpf + '\'' +
                "\n, anoExercicio=" + anoExercicio +
                "\n, nome='" + nome + '\'' +
                "\n, rendimentosAcoes=" + ((rendimentosAcoes != null && !rendimentosAcoes.isEmpty()) ? rendimentosAcoes : "Não há ações")  +
                "\n, rendimentosEmprestimos=" + ((rendimentosEmprestimos != null && !rendimentosEmprestimos.isEmpty()) ? rendimentosEmprestimos : "Não há empréstimos") +
                "\n, rendimentosFinanciamentos=" + ((rendimentosFinanciamentos != null && !rendimentosFinanciamentos.isEmpty()) ? rendimentosFinanciamentos : "Não há financiamentos") +
                "\n, rendimentosFolhaPagamento=" + ((rendimentosFolhaPagamento != null && !rendimentosFolhaPagamento.isEmpty()) ? rendimentosFolhaPagamento : "Não há folha de pagamento") +
                '}';
    }
}
