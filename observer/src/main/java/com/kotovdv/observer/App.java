package com.kotovdv.observer;

import com.kotovdv.observer.mail.Mail;
import com.kotovdv.observer.mail.MailContent;
import com.kotovdv.observer.mail.postoffice.PostOffice;

import static com.kotovdv.observer.mail.postoffice.visitor.PostOfficeVisitor.createVisitor;
import static com.kotovdv.observer.person.Person.*;

/**
 * @author Dmitriy Kotov
 */
public class App {

    public static void main(String[] args) {
        PostOffice postOffice = createPostOffice();
        System.out.println(" ************************* ");

        postOffice.storeMail(createLetter());
        System.out.println(" ************************* ");
        postOffice.storeMail(createResponseLetter());
    }

    private static PostOffice createPostOffice() {
        return new PostOffice()
                .addVisitor(createVisitor(FRANK_SINATRA))
                .addVisitor(createVisitor(JOHN_DOE))
                .addVisitor(createVisitor(FREDDIE_MERCURY));
    }

    private static Mail createLetter() {
        MailContent content = new MailContent("Good day", "How are you?");

        return new Mail(
                FREDDIE_MERCURY,
                FRANK_SINATRA,
                content
        );
    }

    private static Mail createResponseLetter() {
        MailContent content = new MailContent("RE: Good day", "Good! And you?");

        return new Mail(
                FRANK_SINATRA,
                FREDDIE_MERCURY,
                content
        );
    }
}