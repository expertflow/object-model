package com.ef.cim.objectmodel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.index.Indexed;
import java.io.Serializable;

@Getter
@Setter
@ToString
public class WrapUp implements Serializable {
    private String id;
    private String categoryName;
    @Indexed(name = "wrapup_value_1")
    private String value;
}
