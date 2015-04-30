package com.pigovsky.myrest.model;

/**
 * Created by yuriy on 30.04.15.
 */
public class Result {
    String message;

    Boolean success;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
