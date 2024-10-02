package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Social Media Post class is used to display Full Post View in Social Media Features
 */
@ToString
@NoArgsConstructor
public class SocialMediaPost implements Serializable {

    /**
     * Post Id should be passed in order to create valid object of this class
     */
    public SocialMediaPost(String postId) {
        this.id = postId;
    }

    @NotNull(message = "Post Id is mandatory")
    @Getter
    @Setter
    private String id;
    @Getter
    @Setter
    private String text;
    @Getter
    @Setter
    private List<Attachment> attachments = new ArrayList<>();
    @Getter
    @Setter
    private Timestamp timestamp;
    @Getter
    @Setter
    private String username;
    @Getter
    @Setter
    private String permalinkUrl;
    @Getter
    @Setter
    private List<SocialMediaComment> comments = null;
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
