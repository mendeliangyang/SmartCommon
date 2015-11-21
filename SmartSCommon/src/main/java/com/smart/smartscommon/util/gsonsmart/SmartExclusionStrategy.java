/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smart.smartscommon.util.gsonsmart;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Administrator
 */
public class SmartExclusionStrategy implements ExclusionStrategy {

    public SmartExclusionStrategy(Map<Class<?>, String[]> excludeFields) throws ClassNotFoundException {
//        this.c = Class.forName(fqfn.substring(0, fqfn.lastIndexOf(".")));
//        this.fieldName = fqfn.substring(fqfn.lastIndexOf(".") + 1);

        //class maps to array of fields to skip in class  
//        excludedFields.put(com.myapp.model.Person, new String[]{"id"});
//        excludedFields.put(com.myapp.model.User, new String[]{"password"});
        excludedFields = excludeFields;
        //all arrays of fields are sorted lexically for faster lookup  
        for (Entry<Class<?>, String[]> entry : excludedFields.entrySet()) {
            Arrays.sort(entry.getValue());
        }
    }
//    private Class<?> c;
//    private String fieldName;

    private static Map<Class<?>, String[]> excludedFields;

    @Override
    public boolean shouldSkipField(FieldAttributes fa) {
//        return (fa.getDeclaringClass() == c && fa.getName().equals(fieldName));
        if (excludedFields.containsKey(fa.getDeclaredClass())) {
            return Arrays.binarySearch(excludedFields.get(fa.getDeclaredClass()), fa.getName()) >= 0;
        }
        return false;
    }

    @Override
    public boolean shouldSkipClass(Class<?> type) {
        return false;
    }

}
