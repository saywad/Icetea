package com.example.Icetea.util;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response<T> {
    private boolean success = true;
    private String message;
    private String code;
    private String requsetUrl;
    private T result;
    private Object data;

    public Response() {
    }
    public Response(boolean success) {
        this.success = success;
    }

    public Response(String message) {
        this.message = message;
    }

    public Response(T result) {
        this.result = result;
    }

    public Response(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public Response(boolean success, T result) {
        this.success = success;
        this.result = result;
    }

    public Response(String message, String code) {
        this.message = message;
        this.code = code;
    }

    public Response(String message, T result) {
        this.message = message;
        this.result = result;
    }

    public Response(boolean success, String message, T result) {
        this.success = success;
        this.message = message;
        this.result = result;
    }

    public Response(boolean success, String message, String code) {
        this.success = success;
        this.message = message;
        this.code = code;
    }


    public Response(boolean success, String message, String code, String requsetUrl, T result, Object data) {
        this.success = success;
        this.message = message;
        this.code = code;
        this.requsetUrl = requsetUrl;
        this.result = result;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRequsetUrl() {
        return requsetUrl;
    }

    public void setRequsetUrl(String requsetUrl) {
        this.requsetUrl = requsetUrl;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Response{" +
                "success=" + success +
                ", message='" + message + '\'' +
                ", code='" + code + '\'' +
                ", requsetUrl='" + requsetUrl + '\'' +
                ", result=" + result +
                ", data=" + data +
                '}';
    }
}
