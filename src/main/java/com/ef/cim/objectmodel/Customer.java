package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.util.List;
import javax.validation.constraints.NotEmpty;
import org.springframework.data.mongodb.core.index.Indexed;

public class Customer implements Serializable {
    @Indexed
    private String _id;
    private String firstName;
    private List<String> phoneNumber;
    private boolean isAnonymous;
    private int __v;

    // Default Constructor
    public Customer() {

    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean getIsAnonymous() {
        return isAnonymous;
    }

    public void setIsAnonymous(boolean anonymous) {
        isAnonymous = anonymous;
    }

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "_id='" + _id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", isAnonymous=" + isAnonymous +
                ", __v=" + __v +
                '}';
    }
}