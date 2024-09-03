package com.ef.cim.objectmodel;

import com.ef.cim.objectmodel.common.Utils;
import java.io.Serializable;
import jakarta.validation.constraints.NotBlank;

public class EmailSignature implements Serializable {

    private String id;
    @NotBlank
    private String signatureName;
    @NotBlank
    private String channelIdentifier;
    @NotBlank
    private String signatureBody;
    private long createdAt;
    private long updatedAt;

    public EmailSignature() {
        this.id = Utils.getObjectId();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSignatureName() {
        return signatureName;
    }

    public void setSignatureName(String signatureName) {
        this.signatureName = signatureName;
    }

    public String getChannelIdentifier() {
        return channelIdentifier;
    }

    public void setChannelIdentifier(String channelIdentifier) {
        this.channelIdentifier = channelIdentifier;
    }

    public String getSignatureBody() {
        return signatureBody;
    }

    public void setSignatureBody(String signatureBody) {
        this.signatureBody = signatureBody;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    /***
     * String Representation of ChannelConnector.
     * @return String
     */
    @Override
    public String toString() {
        return "EmailSignature{" +
                "id=" + id +
                ", signatureName='" + signatureName + '\'' +
                ", signatureBody=" + signatureName + '\'' +
                ", channelIdentifier=" + channelIdentifier + '\'' +
                ", createdAt=" + createdAt + '\'' +
                ", updatedAt=" + updatedAt +
                '}';
    }
}