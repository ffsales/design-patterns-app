package org.br.sales.poc.patterns.creational.singleton;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class UniqueConfiguration4 {

    private Configuration configuration;

    public UniqueConfiguration4() {
        configuration = Configuration.getConfig();
    }
}
