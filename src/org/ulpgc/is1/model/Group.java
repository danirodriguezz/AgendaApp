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
        for (Member member : membersList) {
            if (member.getContact().getName().equalsIgnoreCase(contact.getName())) {
                System.out.println("Contact " + contact.getName() + " already exists in " + this.getName() + " Group");
                return;
            }
        }
        Member newMember = new Member(contact);
        membersList.add(newMember);
    }

    public void removeContact(int index) {
        membersList.remove(index);
    }
}
