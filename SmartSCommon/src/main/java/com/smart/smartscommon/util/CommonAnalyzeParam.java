/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smart.smartscommon.util;

import com.smart.smartscommon.model.ParamBaseModel;
import java.util.Map;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 *
 * @author Administrator
 */
public class CommonAnalyzeParam {

    private final String paramtokenKey = "token";

    private String RSID = null;
    private String token = null;

    public String getRSID() {
        return RSID;
    }

    protected void setRSID(String RSID) {
        this.RSID = RSID;
    }

    public String getToken() {
        return token;
    }

    private void setToken(String token) {
        this.token = token;
    }

    public ParamBaseModel AnalyzeParamBase(String param) throws Exception {
        ParamBaseModel baseModel = null;
        JSONObject jsonObj = null;
        try {
            jsonObj = JSONObject.fromObject(param);
            baseModel = new ParamBaseModel();
            baseModel.setJsonObjectParam(JSONObject.fromObject(param));
            if (baseModel.getJsonObjectParam().containsKey(paramtokenKey)) {
                this.setToken(baseModel.getJsonObjectParam().getString(paramtokenKey));
            }
            return baseModel;
        } catch (Exception e) {
            throw new Exception("AnalyzeParamBase IAnalyzeReviceParamModel error.strParam:" + param + e.getLocalizedMessage(), e);
        } finally {
            UtileSmart.FreeObjects(jsonObj);
        }
    }

}
