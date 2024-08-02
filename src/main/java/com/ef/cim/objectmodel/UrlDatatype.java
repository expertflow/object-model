package com.ef.cim.objectmodel;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;
import java.net.URL;


@NoArgsConstructor
@AllArgsConstructor
public class UrlDatatype extends ConversationData <URL>{

    @NotNull(message = "URL value cannot be null")
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

