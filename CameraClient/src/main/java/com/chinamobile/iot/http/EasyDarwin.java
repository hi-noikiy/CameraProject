package com.chinamobile.iot.http;

/**
 * Created by malijie on 2017/4/18.
 */

public class EasyDarwin<T> {
    private Header header;
    private Body<T> body;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Body<T> getBody() {
        return body;
    }

    public void setBody(Body<T> body) {
        this.body = body;
    }
}
