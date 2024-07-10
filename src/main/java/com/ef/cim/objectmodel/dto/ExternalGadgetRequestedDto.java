package com.ef.cim.objectmodel.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ExternalGadgetRequestedDto {
    String action;
    List<Gadget> gadgets;
}
