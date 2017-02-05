package com.kotovdv.observer.mail.postoffice;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.kotovdv.observer.mail.Mail;
import com.kotovdv.observer.person.Person;

import java.util.Collection;

/**
 * @author Dmitriy Kotov
 */
public class PostOfficeMailStorage implements PostOfficeReceivingPoint {

    private final Multimap<Person, Mail> mailStorage = HashMultimap.create();

    @Override
    public Collection<Mail> receiveMailFor(Person person) {
        return mailStorage.removeAll(person);
    }

    public void storeMail(Mail mail) {
        this.mailStorage.put(mail.getRecipient(), mail);
    }
}