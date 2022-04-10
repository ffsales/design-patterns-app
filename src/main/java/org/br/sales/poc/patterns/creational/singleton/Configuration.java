package org.br.sales.poc.patterns.creational.singleton;

import lombok.Getter;


public class Configuration {

    private static Configuration INSTANCE_CONFIGURATION;

    private Configuration() {
        this.flagEnableAccess = true;
        this.urlBase = "google.com";
        this.user = "root";
        this.pass = "root123";
    }

    @Getter
    private final boolean flagEnableAccess;
    @Getter
    private final String urlBase;
    @Getter
    private final String user;
    @Getter
    private final String pass;

    public static Configuration getConfig() {
        if (INSTANCE_CONFIGURATION == null) {
            INSTANCE_CONFIGURATION = new Configuration();
        }
        return INSTANCE_CONFIGURATION;
    }

}
