package com.ef.cim.objectmodel.dto;

import com.ef.cim.objectmodel.ConversationParticipant;
import java.util.HashMap;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ParticipantRoleChangedDto {
    private ConversationParticipant conversationParticipant;
    private Map<String, Object> metadata = new HashMap<>();

    public void addMetadata(String key, Object value) {
        this.metadata.put(key, value);
    }

    public void removeMetadata(String key) {
        this.metadata.remove(key);
    }
}
