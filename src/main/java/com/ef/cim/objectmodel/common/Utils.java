package com.ef.cim.objectmodel.common;

import org.bson.types.ObjectId;

public class Utils {

    public  static String getObjectId(){
        return  new ObjectId().toString();
    }
}
