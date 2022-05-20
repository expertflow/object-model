package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.util.UUID;

public class Tenant implements Serializable {
    private UUID id;
    private String name;
//  private KeyCloakRealm realm; // Class KeyCloakRealm Empty | not in object model

    // Default Constructor
    public Tenant() {
        this.id = UUID.randomUUID();
        //  this.realm = new KeyCloakRealm();
    }

    // Getters
    public UUID getId() {
        return this.id;
    }


    public String getName() {
        return this.name;
    }

    /**
     * public KeyCloakRealm getRealm() {
     * return this.realm;
     * }
     */

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    /*
  public void setRealmID(KeyCloakRealm realm) {
    this.realm = realm;
  }*/

    @Override
    public String toString() {
        return "Tenant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
