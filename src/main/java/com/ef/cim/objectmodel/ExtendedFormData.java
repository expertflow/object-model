package com.ef.cim.objectmodel;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ExtendedFormData extends FormData{
    private Object reviewDetail;
    private Sentiment sentiment;

}
