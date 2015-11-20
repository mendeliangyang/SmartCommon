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
public class KeyNotFoundException extends Exception {

    public KeyNotFoundException() {
        super();
    }

    public KeyNotFoundException(String message) {
        super(message);
    }

    public KeyNotFoundException(Throwable throwable) {
        super(throwable);
    }

    public KeyNotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
