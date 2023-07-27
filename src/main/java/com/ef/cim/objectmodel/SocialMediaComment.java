package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Social Media Comment class is used to display Post's Comments in Social Media Features
 */
@ToString
@NoArgsConstructor
public class SocialMediaComment implements Serializable {

    /**
     * Comment Id must be passed in order to create object of this class
     */
    public SocialMediaComment(String commentId) {
        this.id = commentId;
    }

    @NotNull(message = "Comment Id is mandatory")
    @Getter
    @Setter
    private String id;
    @Getter
    @Setter
    private String text;
    @Getter
    @Setter
    private Attachment attachment;
    @Getter
    @Setter
    private Timestamp timestamp;
    @Getter
    @Setter
    private String username;
    @Getter
    @Setter
    private String parentId;
    @Getter
    @Setter
    private Boolean hidden = Boolean.FALSE;
    @Getter
    @Setter
    private Boolean deleted = Boolean.FALSE;
    @Getter
    @Setter
    private List<SocialMediaComment> subComments = null;
    @JsonProperty("additionalData")
    private Map<String,Object> additionalData = null;

    @JsonAnyGetter
    public Map<String, Object> getAdditionalData() {
        return additionalData;
    }
    @JsonAnySetter
    public void setAdditionalData(String key, Object value) {
        if (additionalData == null){
            additionalData = new HashMap<>();
        }
        this.additionalData.put(key, value);
    }
}
