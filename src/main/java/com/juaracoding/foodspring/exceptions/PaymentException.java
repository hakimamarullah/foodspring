package com.juaracoding.foodspring.exceptions;
/*
IntelliJ IDEA 2022.2.2 (Community Edition)
Build #IC-222.4167.29, built on September 13, 2022
Runtime version: 17.0.4+7-b469.53 amd64
@Author hakim a.k.a. Hakim Amarullah
Java Developer
Created on 8/27/2023 2:09 PM
@Last Modified 8/27/2023 2:09 PM
Version 1.0
*/

public class PaymentException extends RuntimeException{

    public PaymentException(String message) {
        super(message);
    }

    public PaymentException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
