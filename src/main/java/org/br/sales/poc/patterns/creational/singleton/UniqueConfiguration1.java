package org.br.sales.poc.patterns.creational.singleton;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class UniqueConfiguration1 {

    private Configuration configuration;

    public UniqueConfiguration1() {
        configuration = Configuration.getConfig();
    }
}
