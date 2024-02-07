package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.util.List;

public class Resource implements Serializable {
    private String rsid;
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

    public String getRsid() {
        return rsid;
    }

    public void setRsid(String rsid) {
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
