/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smart.smartscommon.util.gsonsmart;

import com.google.gson.ExclusionStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.reflect.Modifier;

/**
 *
 * @author Administrator
 */
public class GsonUtilSmart {
    
    public static Gson GsonBuild() {
        return new GsonBuilder()
                .serializeNulls()
                .excludeFieldsWithModifiers(Modifier.TRANSIENT, Modifier.FINAL)
                //                .excludeFieldsWithoutExposeAnnotation()
                .setDateFormat("yyyy-MM-dd HH:mm:ss")
                .create();
    }
    
    public static Gson GsonBuild(ExclusionStrategy exclude) {
        return new GsonBuilder()
                .serializeNulls()
                .setExclusionStrategies(exclude)
                .excludeFieldsWithModifiers(Modifier.TRANSIENT, Modifier.FINAL)
                //                .excludeFieldsWithoutExposeAnnotation()
                .setDateFormat("yyyy-MM-dd HH:mm:ss")
                .create();
    }
    
}
