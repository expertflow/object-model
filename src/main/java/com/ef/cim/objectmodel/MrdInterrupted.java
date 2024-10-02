package com.ef.cim.objectmodel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class MrdInterrupted implements Serializable {
    String mrdId;
    String agentId;
    List<String> conversations;
}