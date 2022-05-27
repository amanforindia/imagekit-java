package io.imagekit.sdk.models;


import com.google.gson.JsonObject;

import java.util.Map;

import okhttp3.ResponseBody;

public class ResponseMetaData {

    private ResponseBody raw;
    private int httpStatusCode;
    private Map<String, String> headers;

    public ResponseBody getRaw() {
        return raw;
    }

    public void setRaw(ResponseBody raw) {
        this.raw = raw;
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }
}
