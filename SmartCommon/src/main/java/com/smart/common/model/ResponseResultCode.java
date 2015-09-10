/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smart.common.model;

public enum ResponseResultCode {

    Error("1000"), Success("0000"), ErrorUserOrPwd("1001"), ErrorSignToken("1002"), ErrorUserName("1003"), ErrorExistAccount("1004"), ErrorExistUser("1005");

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
