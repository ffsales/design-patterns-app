package org.br.sales.poc.patterns.structural.bridge;

import org.br.sales.poc.patterns.structural.bridge.abstraction.Message;
import org.br.sales.poc.patterns.structural.bridge.abstraction.TextMessage;
import org.br.sales.poc.patterns.structural.bridge.implementation.EmailMessageSender;
import org.br.sales.poc.patterns.structural.bridge.implementation.MessageSender;
import org.br.sales.poc.patterns.structural.bridge.implementation.TextMessageSender;

public class Bridge {

    /*
    Prós
        Constói objetos independentes
        Implementa o Princípio aberto/fechado
        Implementa o Princípio de responsabilidade única

    Contras
        Aumenta a complexidade se aplicado em uma classe muito coesa
     */
    public static void main(String[] args) {

        MessageSender textMessageSender=new TextMessageSender();
        Message textMessage=new TextMessage(textMessageSender);
        textMessage.send();

        MessageSender emailMessageSender=new EmailMessageSender();
        Message emailMessage=new TextMessage(emailMessageSender);
        emailMessage.send();
    }
}
