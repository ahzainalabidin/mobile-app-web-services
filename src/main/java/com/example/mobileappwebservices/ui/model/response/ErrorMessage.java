package com.example.mobileappwebservices.ui.model.response;

import java.util.Date;

public class ErrorMessage {

    private Date timestamp;
    private String exceptionType;
    private String message;

    public ErrorMessage() {
    }

    public ErrorMessage(Date timestamp, String exceptionType, String message) {
        this.timestamp = timestamp;
        this.exceptionType = exceptionType;
        this.message = message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getExceptionType() {
        return exceptionType;
    }

    public void setExceptionType(String exceptionType) {
        this.exceptionType = exceptionType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
