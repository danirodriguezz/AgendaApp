package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private final String name;
    private List<Contact> members;


    public Group(String name) {
        this.name = name;
        members = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        members.add(contact);
    }

    public void removeContact(Contact contact) {
        members.remove(contact);
    }
}
