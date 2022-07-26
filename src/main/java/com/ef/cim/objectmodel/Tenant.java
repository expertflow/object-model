package com.ef.cim.objectmodel;

import com.ef.cim.objectmodel.common.Utils;
import java.io.Serializable;

public class Tenant implements Serializable {
    private String id;
    private String name;
//  private KeyCloakRealm realm; // Class KeyCloakRealm Empty | not in object model

    // Default Constructor
    public Tenant() {
        this.id = Utils.getObjectId();
        //  this.realm = new KeyCloakRealm();
    }

    // Getters
    public String getId() {
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

    public void setId(String id) {
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
