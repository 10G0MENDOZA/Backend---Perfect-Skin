package com.app.demo.persistence.entity;

import java.util.List;

public class Email {
    private String to;
    private String subject;
    private String body;
    private List<String> attachments;

    // Constructores, getters y setters

    public Email() {
    }

    public Email(String to, String subject, String body, List<String> attachments) {
        this.to = to;
        this.subject = subject;
        this.body = body;
        this.attachments = attachments;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<String> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<String> attachments) {
        this.attachments = attachments;
    }
}
