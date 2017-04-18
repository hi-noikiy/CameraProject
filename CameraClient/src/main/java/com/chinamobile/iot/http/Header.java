package com.chinamobile.iot.http;

/**
 * Created by malijie on 2017/4/18.
 */

public class Header {
    private String CSeq;
    private String ErrorNum;
    private String ErrorString;
    private String MessageType;
    private String Version;

    public String getCSeq() {
        return CSeq;
    }

    public void setCSeq(String CSeq) {
        this.CSeq = CSeq;
    }

    public String getErrorNum() {
        return ErrorNum;
    }

    public void setErrorNum(String errorNum) {
        ErrorNum = errorNum;
    }

    public String getErrorString() {
        return ErrorString;
    }

    public void setErrorString(String errorString) {
        ErrorString = errorString;
    }

    public String getMessageType() {
        return MessageType;
    }

    public void setMessageType(String messageType) {
        MessageType = messageType;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }
}
