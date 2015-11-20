/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smart.smartscommon.model;

import net.sf.json.JSONObject;

/**
 *
 * @author Administrator
 */
public class ParamBaseModel {

    private JSONObject JsonObjectParam;

    public JSONObject getJsonObjectParam() {
        return JsonObjectParam;
    }

    public void setJsonObjectParam(JSONObject JsonObjectParam) {
        this.JsonObjectParam = JsonObjectParam;
    }

}
