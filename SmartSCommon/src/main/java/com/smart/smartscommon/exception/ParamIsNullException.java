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
public class ParamIsNullException extends Exception {

    public ParamIsNullException() {
        super();
    }

    public ParamIsNullException(String message) {
        super(message);
    }

    public ParamIsNullException(Throwable throwable) {
        super(throwable);
    }

    public ParamIsNullException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
