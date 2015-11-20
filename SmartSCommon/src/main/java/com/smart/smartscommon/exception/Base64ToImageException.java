/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smart.smartscommon.exception;

/**
 *
 * @author Administrator
 */
public class Base64ToImageException extends Exception {

    public Base64ToImageException() {
        super();
    }

    public Base64ToImageException(String message) {
        super(message);
    }

    public Base64ToImageException(Throwable throwable) {
        super(throwable);
    }

    public Base64ToImageException(String message, Throwable throwable) {
        super(message, throwable);
    }
}