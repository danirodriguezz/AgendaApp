package org.ulpgc.is1.model;

import java.util.Date;

public class Member {
    private Date date;
    private Contact contact;

    public Member(Contact contact) {
        this.date = new Date();
        this.contact = contact;
    }

    public Date getDate() {
        return date;
    }

    public Contact getContact() {
        return contact;
    }
}
