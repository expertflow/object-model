package com.ef.cim.objectmodel;

import java.io.Serializable;

public interface ICimMessage extends Serializable {
    String getId();

    MessageHeader getHeader();

    void setHeader(MessageHeader header);
}