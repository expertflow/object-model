package com.ef.cim.objectmodel;

import lombok.AllArgsConstructor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.net.URL;

@AllArgsConstructor
public class UrlDatatype extends ConversationData <URL>{
    public UrlDatatype() {
        super();
    }
    @Valid
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

