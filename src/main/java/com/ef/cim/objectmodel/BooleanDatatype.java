package com.ef.cim.objectmodel;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class BooleanDatatype extends ConversationData {
    private String key;
    private Boolean value;
}
