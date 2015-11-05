/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smart.common.model;

public enum ResponseResultCode {

    Error("1000"), Success("0000"), ErrorSignToken("1002"), ErrorParam("1001"),
    ErrorUserOrPwd("2002"), ErrorUserName("2003"), ErrorExistAccount("2004"), ErrorExistUser("2005"), ErrorUnExistAccount("2006"), ErrorExistAccountBind("2007");

    private String describe;

    ResponseResultCode(String idx) {
        this.describe = idx;
    }

    public String getDescribe() {
        return describe;
    }

    @Override
    public String toString() {
        return describe;
    }
}
