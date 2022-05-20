package com.ef.cim.objectmodel;

import java.util.UUID;
import javax.validation.Valid;

public class CimMessage implements ICimMessage {
    private final UUID id;
    @Valid
    private MessageHeader header;
    @Valid
    private MessageBody body;

    public CimMessage() {
        this.id = UUID.randomUUID();
    }

    // Constructor --> Args: header, body
    public CimMessage(MessageHeader header, MessageBody body) {
        this.id = UUID.randomUUID();
        this.header = header;
        this.body = body;
    }

    // Getters
    public UUID getId() {
        return this.id;
    }

    public MessageHeader getHeader() {
        return this.header;
    }

    // Setters
    public void setHeader(MessageHeader header) {
        this.header = header;
    }

    public MessageBody getBody() {
        return this.body;
    }

    public void setBody(MessageBody body) {
        this.body = body;
    }

    /***
     * String Representation of CimMessage
     * @return String
     */
    @Override
    public String toString() {
        return "CimMessage{" +
                "id=" + id +
                ", header=" + header +
                ", body=" + body +
                '}';
    }
}