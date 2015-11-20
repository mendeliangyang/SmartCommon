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
public class ValueIsNullException extends Exception {

    public ValueIsNullException() {
        super();
    }

    public ValueIsNullException(String message) {
        super(message);
    }

    public ValueIsNullException(Throwable throwable) {
        super(throwable);
    }

    public ValueIsNullException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
