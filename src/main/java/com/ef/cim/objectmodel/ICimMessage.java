package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.util.UUID;

public interface ICimMessage extends Serializable {
    UUID getId();

    MessageHeader getHeader();

    void setHeader(MessageHeader header);
}