package com.fer.snp.backend.services;

import com.fer.snp.backend.entities.Email;

public class MailService implements IMailService {
    private String posiljatelj;

    public MailService(String posiljatelj) {
        this.posiljatelj = posiljatelj;
    }

    public void sendMail(Email email) {
        System.out.println("Mail poslan!");
    }

    public void sendMailWithAttachment(Email email) {
        System.out.println("Mail s privitkom poslan!");
    }
}
