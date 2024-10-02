package com.ef.cim.objectmodel;

import javax.validation.constraints.NotBlank;

public class Language {
    @NotBlank(message = "language code is mandatory")
    private String code;
    @NotBlank(message = "language policy is mandatory")
    private String policy;

    public Language() {
    }

    public Language(String code, String policy) {
        this.code = code;
        this.policy = policy;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    @Override
    public String toString() {
        return "Language{" +
                "code='" + code + '\'' +
                ", policy='" + policy + '\'' +
                '}';
    }
}
