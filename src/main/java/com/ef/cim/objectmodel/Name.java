package com.ef.cim.objectmodel;

public class Name {
    private String formatted_name;
    private String first_name;
    private String last_name;
    private String middle_name;
    private String suffix;
    private String prefix;

    //Default Constructor
    public Name() {
    }

    //Parametrized Constructor

    public Name(String formattedName, String firstName, String lastName, String middleName, String suffix,
            String prefix) {
        this.formatted_name = formattedName;
        this.first_name = firstName;
        this.last_name = lastName;
        this.middle_name = middleName;
        this.suffix = suffix;
        this.prefix = prefix;
    }

    public String getFormatted_name() {
        return formatted_name;
    }

    public void setFormatted_name(String formatted_name) {
        this.formatted_name = formatted_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String toString() {
        return "Name{" +
                "formattedName='" + formatted_name + '\'' +
                ", firstName='" + first_name + '\'' +
                ", lastName='" + last_name + '\'' +
                ", middleName='" + middle_name + '\'' +
                ", suffix='" + suffix + '\'' +
                ", prefix='" + prefix + '\'' +
                '}';
    }
}
