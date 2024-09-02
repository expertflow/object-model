package com.ef.cim.objectmodel;

import com.ef.cim.objectmodel.common.Utils;
import jakarta.validation.Valid;

public class CimMessage implements ICimMessage {
    private final String id;
    @Valid
    private MessageHeader header;
    @Valid
    private MessageBody body;

    public CimMessage() {
        this.id = Utils.getObjectId();
    }

    // Constructor --> Args: header, body
    public CimMessage(MessageHeader header, MessageBody body) {
        this.id = Utils.getObjectId();
        this.header = header;
        this.body = body;
    }

    public CimMessage(String id, MessageHeader header, MessageBody body) {
        this.id = id;
        this.header = header;
        this.body = body;
    }

    // Getters
    public String getId() {
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