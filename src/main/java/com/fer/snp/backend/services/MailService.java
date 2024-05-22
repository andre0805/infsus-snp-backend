package com.fer.snp.backend.services;

import com.fer.snp.backend.entities.Email;

public class MailService implements IMailService {
    private final String posiljatelj;

    public MailService(String posiljatelj) {
        this.posiljatelj = posiljatelj;
    }

    public void sendMail(Email email) {
        System.out.println("Mail sent from: " + posiljatelj + "to: " + email.getPrimatelj());
        System.out.println("\tSubject: " + email.getNaslov());
        System.out.println("\tMessage: " + email.getPoruka());
    }

    public void sendMailWithAttachment(Email email) {
        System.out.println("Mail sent from: " + posiljatelj + "to: " + email.getPrimatelj());
        System.out.println("\tSubject: " + email.getNaslov());
        System.out.println("\tMessage: " + email.getPoruka());
        System.out.println("\tAttachment: " + email.getPrivitak());
    }
}
