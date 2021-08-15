package com.littlebill.webapp.security.email;

public interface EmailSender {

    void send(String to, String email);
}
