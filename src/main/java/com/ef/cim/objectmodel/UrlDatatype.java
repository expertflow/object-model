package com.ef.cim.objectmodel;
import com.ef.cim.objectmodel.enums.ConversationTypeEnum;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import java.net.URL;


@NoArgsConstructor
@AllArgsConstructor
public class UrlDatatype extends ConversationData <URL>{

    private URL value;
   @Override
    public URL getValue() {
        return value;
    }

    @Override
    public void setValue(URL value) {
        this.value=value;
    }
}

