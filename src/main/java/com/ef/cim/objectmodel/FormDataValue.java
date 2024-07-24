package com.ef.cim.objectmodel;

import com.mongodb.annotations.ThreadSafe;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FormDataValue extends FormData{
    private Object reviewDetail;
    private Sentiment sentiment;

}
