package com.kotovdv.observer.mail;

import com.kotovdv.observer.person.Person;

/**
 * @author Dmitriy Kotov
 */
public class Mail {

    private final Person sender;
    private final Person recipient;
    private final MailContent mailContent;

    public Mail(Person sender, Person recipient, MailContent mailContent) {
        this.sender = sender;
        this.recipient = recipient;
        this.mailContent = mailContent;
    }

    public Person getSender() {
        return sender;
    }

    public Person getRecipient() {
        return recipient;
    }

    public String getSubject() {
        return mailContent.getSubject();
    }

    public String getText() {
        return mailContent.getText();
    }

    @Override
    public String toString() {
        return "Mail{" +
                "sender=" + sender +
                ", recipient=" + recipient +
                ", mailContent=" + mailContent +
                '}';
    }
}