package com.ef.cim.objectmodel;

public class Team {
    private int id;
    private String name;
    private Tenant tenant;

    public Team() {
        tenant = new Tenant();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tenant=" + tenant +
                '}';
    }
}
