package com.ef.cim.objectmodel;

import java.util.List;

public class WrapUpMessage extends MessageBody {

    private String note;
    private List<Object> wrapups;

    public WrapUpMessage() {
        super(MessageType.WRAPUP);
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<Object> getWrapups() {
        return wrapups;
    }

    public void setWrapups(List<Object> wrapups) {
        this.wrapups = wrapups;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WrapUpMessage{");
        sb.append("note='").append(note).append('\'');
        sb.append(", wrapups=").append(wrapups);
        sb.append(", type=").append(type);
        sb.append(", markdownText='").append(markdownText).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
