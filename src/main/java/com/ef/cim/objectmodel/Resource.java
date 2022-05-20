package com.ef.cim.objectmodel;

import java.util.List;
import java.util.UUID;

public class Resource {
    private UUID rsid;
    private String rsname;
    private List<String> scopes;

    public List<String> getScopes() {
        return scopes;
    }

    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }


    public boolean containsScope(String scope) {
        return this.scopes.contains(scope);
    }

    public boolean addScope(String scope) {
        return this.scopes.add(scope);
    }

    public boolean removeScope(String scope) {
        return this.scopes.remove(scope);
    }

    public UUID getRsid() {
        return rsid;
    }

    public void setRsid(UUID rsid) {
        this.rsid = rsid;
    }

    public String getRsname() {
        return rsname;
    }

    public void setRsname(String rsname) {
        this.rsname = rsname;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "rsid=" + rsid +
                ", rsname='" + rsname + '\'' +
                ", scopes=" + scopes +
                '}';
    }
}
