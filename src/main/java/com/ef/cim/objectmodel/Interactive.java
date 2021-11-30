package com.ef.cim.objectmodel;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

public class Interactive {

    @NotBlank(message = "type is mandatory")
    private String type;
    private Header header;
    @Valid
    private Body body;
    private Footer footer;
    @Valid
    private Action action;

    public Interactive() {
    }

    public Interactive(String type, Header header, Body body, Footer footer, Action action) {
        this.type = type;
        this.header = header;
        this.body = body;
        this.footer = footer;
        this.action = action;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Footer getFooter() {
        return footer;
    }

    public void setFooter(Footer footer) {
        this.footer = footer;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Interactive{" +
                "type='" + type + '\'' +
                ", header=" + header +
                ", body=" + body +
                ", footer=" + footer +
                ", action=" + action +
                '}';
    }
}