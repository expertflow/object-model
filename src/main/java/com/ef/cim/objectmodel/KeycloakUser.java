package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class KeycloakUser implements Serializable {
    private String id;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    private List<String> roles = new ArrayList<>();
    private String username;
    private Resources permittedResources;
    private String realm;
    private Map<String, Object> attributes = new HashMap<>();
    private Team userTeam;
    private List<Object> supervisedTeams = new ArrayList<>();

    public boolean containsRole(String role) {
        return this.roles.contains(role);
    }

    public boolean addRole(String role) {
        return this.roles.add(role);
    }

    public boolean removeRole(String role) {
        return this.roles.remove(role);
    }

    @JsonIgnore
    public String displayName() {
        if (!StringUtils.isBlank(firstName) && !StringUtils.isBlank(lastName)) {
            return firstName + " " + lastName;
        } else if (!StringUtils.isBlank(firstName)) {
            return firstName;
        } else {
            return username;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeycloakUser that = (KeycloakUser) o;
        return id.equals(that.id) && firstName.equals(that.firstName) && lastName.equals(that.lastName) &&
                Objects.equals(roles, that.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, roles);
    }
}
