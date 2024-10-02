package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "agents")
public class CCUser implements Participant {
    @Id
    private String id;
    @NotNull
    @Valid
    private KeycloakUser keycloakUser;
    private List<AssociatedRoutingAttribute> associatedRoutingAttributes;
    private String participantType;
    private List<AssociatedMrd> associatedMrds;

    public CCUser() {
        this.associatedRoutingAttributes = new ArrayList<>();
        this.associatedMrds = new ArrayList<>();
        this.participantType = "CCUser";
    }

    @JsonIgnore
    @Override
    public String getDisplayName() {
        if (keycloakUser != null) {
            return this.keycloakUser.getFirstName() + " " + this.keycloakUser.getLastName();
        }
        return null;
    }


    @Override
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public KeycloakUser getKeycloakUser() {
        return keycloakUser;
    }

    public void setKeycloakUser(KeycloakUser keycloakUser) {
        this.keycloakUser = keycloakUser;
    }

    public List<AssociatedRoutingAttribute> getAssociatedRoutingAttributes() {
        return associatedRoutingAttributes;
    }

    public void setAssociatedRoutingAttributes(
            List<AssociatedRoutingAttribute> associatedRoutingAttributes) {
        this.associatedRoutingAttributes = associatedRoutingAttributes;
    }

    public boolean containsAssociatedRoutingAttribute(
            AssociatedRoutingAttribute associatedRoutingAttribute) {
        return this.associatedRoutingAttributes.contains(associatedRoutingAttribute);
    }

    public boolean addAssociatedRoutingAttribute(
            AssociatedRoutingAttribute associatedRoutingAttribute) {
        return this.associatedRoutingAttributes.add(associatedRoutingAttribute);
    }

    public boolean removeAssociatedRoutingAttribute(
            AssociatedRoutingAttribute associatedRoutingAttribute) {
        return this.associatedRoutingAttributes.remove(associatedRoutingAttribute);
    }

    public boolean containsAssociatedMrd(AssociatedMrd associatedMrd) {
        return this.associatedMrds.contains(associatedMrd);
    }

    public boolean addAssociatedMrd(AssociatedMrd associatedMrd) {
        return this.associatedMrds.add(associatedMrd);
    }

    public boolean removeAssociatedMrd(AssociatedMrd associatedMrd) {
        return this.associatedMrds.remove(associatedMrd);
    }
    public List<AssociatedMrd> getAssociatedMrds() {
        return associatedMrds;
    }

    public void setAssociatedMrds(List<AssociatedMrd> associatedMrds) {
        this.associatedMrds = associatedMrds;
    }

    public String getParticipantType() {
        return participantType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CCUser ccUser = (CCUser) o;
        return Objects.equals(id, ccUser.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "CCUser{" +
                "id=" + id +
                ", keycloakUser=" + keycloakUser +
                ", associatedRoutingAttributes=" + associatedRoutingAttributes +
                ", participantType='" + participantType + '\'' +
                ", associatedMrds=" + associatedMrds +
                '}';
    }
}