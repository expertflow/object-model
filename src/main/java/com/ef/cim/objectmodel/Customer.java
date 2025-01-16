package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.data.mongodb.core.index.Indexed;

public class Customer implements Serializable {
    @Indexed
    private String _id;
    private String firstName;
    private List<String> phoneNumber;

    private boolean isAnonymous;
    private int __v;


    private Map<String, Object> additionalDetail = new HashMap<>();

    @JsonAnySetter
    public void setAdditionalDetail(String key, Object value) {
        additionalDetail.put(key, value);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalDetail() {
        return additionalDetail;
    }


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
                ", additionalDetail=" + additionalDetail +
                '}';
    }
}