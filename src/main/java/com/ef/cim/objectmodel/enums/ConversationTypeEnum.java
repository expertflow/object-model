package com.ef.cim.objectmodel.enums;

public enum ConversationTypeEnum {
    BOOLEAN,
    INT,
    FORM_DATA,
    STRING,
    STRING_LIST,
    URL;

    public static String fromString(String type) {
        ConversationTypeEnum enumValue = ConversationTypeEnum.valueOf(type.toUpperCase());
        return enumValue.name();
    }
}
