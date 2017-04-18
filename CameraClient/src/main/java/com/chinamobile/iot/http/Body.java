package com.chinamobile.iot.http;

/**
 * Created by malijie on 2017/4/18.
 */

public class Body<T> {
    private String DeviceCount;
    private T t;

    public void setDeviceCount(String deviceCount) {
        DeviceCount = deviceCount;
    }

    public void setT(T t) {
        this.t = t;
    }

    public String getDeviceCount() {
        return DeviceCount;
    }

    public T getT() {
        return t;
    }
}
