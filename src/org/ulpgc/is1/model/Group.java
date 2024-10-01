package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Group {
    private final String name;
    private ArrayList<Member> membersList;

    public List<Member> getMembers() {
        return membersList;
    }

    public Group(String name) {
        this.name = name;
        membersList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addContact(Contact contact) {
        Member newMember = new Member(contact);
        membersList.add(newMember);
    }

    public void removeContact(int index) {
        membersList.remove(index);
    }
}
