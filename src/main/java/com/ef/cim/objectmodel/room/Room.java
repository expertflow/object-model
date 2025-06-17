package com.ef.cim.objectmodel.room;

import com.ef.cim.objectmodel.audit.AuditMetadata;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document("rooms")
public class Room extends AuditMetadata implements Serializable, Persistable<String> {
    @Indexed
    @Id
    private String id;
    @NotBlank(message = "Field 'name' can not blank")
    private String name;
    private String description;
    @NotEmpty(message = "Field 'members' can not be empty list")
    private List<@Valid RoomMember> members;
    @NotNull(message = "Field 'type' can not null")
    private RoomType type;
    @Indexed
    @NotNull(message = "Field 'mode' can not be blank")
    private RoomMode mode;
    @Indexed
    @NotBlank(message = "Field 'label' can not be blank")
    private String label;
    private Object lastMessage;
    @Transient
    @JsonIgnore
    private boolean isNew = false;

    /**
     * parametrized constructor.
     * @param id id
     * @param name name
     * @param description description
     * @param members members
     * @param type type
     * @param mode mode
     * @param label label
     * @param lastMessage lastMessage
     */
    public Room(String id, String name, String description, List<RoomMember> members, RoomType type,
                RoomMode mode, String label, Object lastMessage, Boolean isDeleted, String createdBy) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.members = members;
        this.mode = mode;
        this.type = type;
        this.label = label;
        this.lastMessage = lastMessage;
    }

    public RoomMember findMemberById(String id) {
        return this.members.stream().filter(m -> m.getId().equals(id)).findFirst().orElse(null);
    }

    /**
     * Find member index int.
     *
     * @param id the id
     * @return the int
     */
    public int findMemberIndex(String id) {
        for (int i = 0; i < this.members.size(); i++) {
            if (this.members.get(i).getId().equals(id)) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Gets customer member.
     *
     * @return the customer member
     */
    @JsonIgnore
    public RoomMember getCustomerMember() {
        return this.getMembers().stream()
                .filter(m -> m.getType().equals(RoomMemberType.CUSTOMER))
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Room room = (Room) o;
        return id.equals(room.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void markNew() {
        this.isNew = true;
    }

    @JsonIgnore
    @Override
    public boolean isNew() {
        return this.isNew;
    }
}
