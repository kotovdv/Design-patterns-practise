package com.kotovdv.observer.mail.postoffice.visitor;

import com.kotovdv.observer.mail.Mail;
import com.kotovdv.observer.mail.postoffice.PostOfficeReceivingPoint;
import com.kotovdv.observer.person.Person;

import java.util.Collection;

/**
 * @author Dmitriy Kotov
 */
public class PostOfficeVisitor {

    private final Person identity;

    private PostOfficeVisitor(Person identity) {
        this.identity = identity;
    }

    public static PostOfficeVisitor createVisitor(Person identity) {
        return new PostOfficeVisitor(identity);
    }

    public void update(PostOfficeReceivingPoint receivingPoint) {
        Collection<Mail> receivedMail = receivingPoint.receiveMailFor(this.identity);

        if (receivedMail.isEmpty()) {
            System.out.printf("There were no new letters for [%s]%n", this.identity);
        } else {
            receivedMail.forEach(mail -> System.out.println(formatNotification(mail)));
        }
    }

    private String formatNotification(Mail mail) {
        return String.format("[%s] received mail from [%s] with subject [%s] and text [%s]",
                identity,
                mail.getSender(),
                mail.getSubject(),
                mail.getText());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostOfficeVisitor that = (PostOfficeVisitor) o;

        return identity != null ? identity.equals(that.identity) : that.identity == null;
    }

    @Override
    public int hashCode() {
        return identity != null ? identity.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "PostOfficeVisitor{" +
                "identity=" + identity +
                '}';
    }
}