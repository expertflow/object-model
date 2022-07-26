package com.ef.cim.objectmodel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.validation.constraints.NotNull;

public class KeycloakUser {
    private String id;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    private List<String> roles;

    private String username;

    private Resources permittedResources;
    private String realm;

    public KeycloakUser() {
        roles = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public boolean containsRole(String role) {
        return this.roles.contains(role);
    }

    public boolean addRole(String role) {
        return this.roles.add(role);
    }

    public boolean removeRole(String role) {
        return this.roles.remove(role);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Resources getPermittedResources() {
        return permittedResources;
    }

    public void setPermittedResources(Resources permittedResources) {
        this.permittedResources = permittedResources;
    }

    public String getRealm() {
        return realm;
    }

    public void setRealm(String realm) {
        this.realm = realm;
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

    @Override
    public String toString() {
        return "KeycloakUser{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' +
                ", roles=" + roles + '}';
    }
}
