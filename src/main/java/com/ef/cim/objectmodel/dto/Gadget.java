package com.ef.cim.objectmodel.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Gadget {
    String gadgetId;
    String agentId;
    String title;
    String value;
}