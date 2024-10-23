package com.ef.cim.objectmodel;

import java.util.Objects;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "routingAttributes")
public class RoutingAttribute {
    @Id
    private String id;
    @NotNull
    @Size(min = 3, max = 110)
    private String name;
    @Size(max = 500)
    private String description;
    @NotNull
    private RoutingAttributeType type;
    private int defaultValue;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RoutingAttributeType getType() {
        return type;
    }

    public void setType(RoutingAttributeType type) {
        this.type = type;
    }

    public int getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(int defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RoutingAttribute that = (RoutingAttribute) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "RoutingAttribute{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", description='" + description + '\''
                + ", type=" + type
                + ", defaultValue='" + defaultValue + '\''
                + '}';
    }
}
