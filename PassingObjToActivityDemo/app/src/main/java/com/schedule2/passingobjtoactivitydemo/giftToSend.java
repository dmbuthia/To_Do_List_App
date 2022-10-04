package com.schedule2.passingobjtoactivitydemo;

import java.io.Serializable;

public class giftToSend implements Serializable {

    String senderName, subject, wishes;
    String [] message;

    public giftToSend(String senderName, String subject, String wishes, String[] message) {
        this.senderName = senderName;
        this.subject = subject;
        this.wishes = wishes;
        this.message = message;
    }

}
