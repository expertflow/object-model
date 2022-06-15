package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * The type Media routing domain.
 */
@Getter
@Setter
@ToString
@Document(value = "mediaRoutingDomains")
public class MediaRoutingDomain implements Serializable {
    /**
     * The ID.
     */
    @Id
    private String id;
    /**
     * The Name.
     */
    @NotNull
    @Size(min = 3, max = 110)
    private String name;
    /**
     * The Description.
     */
    @Size(max = 500)
    private String description;
    /**
     * The Interruptible.
     */
    @NotNull
    private boolean interruptible;
    /**
     * The Max requests.
     */
    @Min(value = 1, message = "Maximum requests should be greater than 0")
    private int maxRequests;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MediaRoutingDomain that = (MediaRoutingDomain) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}