package com.ef.cim.objectmodel.task;

import com.ef.cim.objectmodel.Enums;
import java.util.HashMap;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TaskType {
    private Enums.TaskTypeDirection direction;
    private Enums.TaskTypeMode mode;
    private Map<String, Object> metadata = new HashMap<>();

    public void putMetadata(String key, Object value) {
        this.metadata.put(key, value);
    }

    public void removeMetadata(String key) {
        this.metadata.remove(key);
    }
}
