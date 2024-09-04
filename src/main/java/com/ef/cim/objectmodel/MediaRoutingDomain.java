package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * The type Media routing domain.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(value = "mediaRoutingDomains")
public class MediaRoutingDomain implements Serializable {
    /**
     * The ID.
     */
    @Id
    private String id;
    /**
     * The Type.
     */
    private String type;
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