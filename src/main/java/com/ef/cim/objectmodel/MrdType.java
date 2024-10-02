package com.ef.cim.objectmodel;

import com.ef.cim.objectmodel.enums.MrdTypeName;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * The type Mrd type.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(value = "mrdTypes")
public class MrdType {
    /**
     * The ID.
     */
    @Id
    private String id;
    /**
     * The Name.
     */
    private MrdTypeName name;
    /**
     * The Managed by re.
     */
    private boolean managedByRe;
    /**
     * The Auto join.
     */
    private boolean autoJoin;
    /**
     * The Interruptible.
     */
    private boolean interruptible;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MrdType that = (MrdType) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
