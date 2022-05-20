package com.ef.cim.objectmodel;

import java.util.ArrayList;
import java.util.List;

public class ContactMessage extends StructuredMessage {
    private List<Contact> contacts;

    // Default Constructor
    public ContactMessage() {
        super(MessageType.CONTACT);
        contacts = new ArrayList<>();
    }

    //Parameterized Constructor
    public ContactMessage(List<Contact> contacts) {
        super(MessageType.CONTACT);
        this.contacts = contacts;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }


    @Override
    public String toString() {
        return "ContactMessage{" +
                "contacts=" + contacts +
                ", type=" + type +
                ", markdownText='" + markdownText + '\'' +
                ", additionalDetails=" + additionalDetails +
                '}';
    }
}