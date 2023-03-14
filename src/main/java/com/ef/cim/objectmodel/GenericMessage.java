package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

public class GenericMessage extends MessageBody {
    /**
     * Default Constructor
     *
     * @param type value of MessageType
     */
    public GenericMessage(@JsonProperty("type") String type) {
        super(type);
    }

    private Map<String, Object> additionalDetail = new HashMap<>();


    @JsonAnySetter
    public void setAdditionalDetail(String key, Object value) {
        additionalDetail.put(key, value);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalDetail() {
        return additionalDetail;
    }


}
