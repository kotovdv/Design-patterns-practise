package com.kotovdv.observer.mail.postoffice;

import com.kotovdv.observer.mail.Mail;
import com.kotovdv.observer.person.Person;

import java.util.Collection;

/**
 * @author Dmitriy Kotov
 */
public interface PostOfficeReceivingPoint {

    /**
     * Returns all letters addressed to one particular person
     *
     * @param person - addressee of letters
     * @return collection of all the letters found in storage
     * If there were no letters - returns empty collection
     */
    Collection<Mail> receiveMailFor(Person person);
}