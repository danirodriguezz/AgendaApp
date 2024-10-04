package org.ulpgc.is1.model;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Member {
    private Date date;
    private Contact contact;

    public Member(Contact contact) {
        this.date = new Date();
        this.contact = contact;
    }

    public String getDate() {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormatter.format(this.date);
    }

    public Contact getContact() {
        return this.contact;
    }
}
