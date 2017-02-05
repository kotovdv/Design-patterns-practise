package com.kotovdv.observer.mail;

/**
 * @author Dmitriy Kotov
 */
public class MailContent {

    private final String subject;
    private final String text;

    public MailContent(String subject, String text) {
        this.subject = subject;
        this.text = text;
    }

    public String getSubject() {
        return subject;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "MailContent{" +
                "subject='" + subject + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}