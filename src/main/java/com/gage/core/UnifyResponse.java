package com.gage.core;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UnifyResponse {

    private Integer code;
    private String message;
    private String request;
    //    @Convert(converter = ListANDJson.class)
    private Object data;

    public UnifyResponse(int code, String message, String request, Object data) {
        this.code = code;
        this.message = message;
        this.request = request;
        this.data = data;
    }

    public UnifyResponse(int code, String message, String request, String data) {
        this.code = code;
        this.message = message;
        this.request = request;
        this.data = data;
    }
}
