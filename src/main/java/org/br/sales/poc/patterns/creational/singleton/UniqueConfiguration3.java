package org.br.sales.poc.patterns.creational.singleton;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class UniqueConfiguration3 {

    private Configuration configuration;

    public UniqueConfiguration3() {
        configuration = Configuration.getConfig();
    }
}
