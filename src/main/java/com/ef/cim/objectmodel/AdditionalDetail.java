package com.ef.cim.objectmodel;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AdditionalDetail {
    private User reviewer;
    private User agent;
}
