package com.kotovdv.observer.mail.postoffice;

import com.kotovdv.observer.mail.Mail;
import com.kotovdv.observer.mail.postoffice.visitor.PostOfficeVisitor;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Dmitriy Kotov
 */
public class PostOffice {

    private final Set<PostOfficeVisitor> visitors = new HashSet<>();
    private PostOfficeMailStorage mailStorage = new PostOfficeMailStorage();

    public void storeMail(Mail mail) {
        this.mailStorage.storeMail(mail);
        visitors.forEach(mailObserver -> mailObserver.update(mailStorage));
    }

    public PostOffice addVisitor(PostOfficeVisitor visitor) {
        visitors.add(visitor);
        System.out.printf("Added visitor [%s]%n", visitor);

        return this;
    }

    public PostOffice removeVisitor(PostOfficeVisitor visitor) {
        visitors.remove(visitor);
        System.out.printf("Removed visitor [%s]%n", visitor);

        return this;
    }
}