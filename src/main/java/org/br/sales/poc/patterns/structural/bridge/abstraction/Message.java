package org.br.sales.poc.patterns.structural.bridge.abstraction;

import org.br.sales.poc.patterns.structural.bridge.implementation.MessageSender;

public abstract class Message {

    protected MessageSender messageSender;

    public Message(MessageSender messageSender){
        this.messageSender=messageSender;
    }

    abstract public void send();
}
