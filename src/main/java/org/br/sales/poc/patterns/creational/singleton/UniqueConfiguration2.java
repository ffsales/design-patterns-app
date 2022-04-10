package org.br.sales.poc.patterns.creational.singleton;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class UniqueConfiguration2 {

    private Configuration configuration;

    public UniqueConfiguration2() {
        configuration = Configuration.getConfig();
    }
}
