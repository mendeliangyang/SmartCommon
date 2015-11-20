/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smart.smartscommon.util;

import java.util.Iterator;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import java.util.Map;

/**
 *
 * @author Administrator
 */
public class AnalyzeParam {

    public static void AnalyzeParamToMap(String jsonStr, Map<String, Object> paramModel) throws Exception {

        JSONObject objSourceTemp = JSONObject.fromObject(jsonStr);

        for (Object key : objSourceTemp.keySet()) {
            Object objTemp = objSourceTemp.get(key);
            if (objTemp instanceof String) {
                paramModel.put(key.toString(), objTemp);
            } else if (objTemp instanceof JSONArray) {
                paramModel.put(key.toString(), JSONArray.fromObject(objTemp));
            } else if (objTemp instanceof JSONObject) {
                //todo 在chat系统中jsonobject转换成string比较容易处理，但是在其他场景中就麻烦了，所以这里需要更改成jsonobject
                paramModel.put(key.toString(), objTemp.toString());
            } else {
                throw new Exception("param unknow type.");
            }

        }
    }

}
