package com.ef.cim.objectmodel;

import com.ef.cim.objectmodel.common.Utils;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ExternalParticipant implements Participant {
    private String id;
    private String displayName;
    private String participantType;

    public ExternalParticipant(String id, String name) {
        this.id = id != null ? id : Utils.getObjectId();
        this.displayName = "External: " + ((name != null && !name.isBlank()) ? name : this.id);
        this.participantType = "External";
    }
}
