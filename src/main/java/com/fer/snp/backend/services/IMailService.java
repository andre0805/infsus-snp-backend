package com.fer.snp.backend.services;

import com.fer.snp.backend.entities.Email;

public interface IMailService {
    void sendMail(Email email);
    void sendMailWithAttachment(Email email);
}
