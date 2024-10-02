package com.ef.cim.objectmodel;

import java.util.Map;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ActionMessageBody extends MessageBody {
    private String name;
    private Map<String, Object> data;

    public ActionMessageBody() {
        super(MessageType.ACTION);
    }

    @Override
    public String toString() {
        return "ActionMessageBody{" +
                "name='" + name + '\'' +
                ", data=" + data +
                ", type=" + type +
                ", markdownText='" + markdownText + '\'' +
                '}';
    }
}
