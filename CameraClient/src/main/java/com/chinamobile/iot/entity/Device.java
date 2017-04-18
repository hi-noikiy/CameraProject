package com.chinamobile.iot.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by malijie on 2017/4/18.
 */

public class Device {

    private String AppType;
    private String Name;
    private String Serial;
    private String SnapURL;
    private String Tag;
    private String TerminalType;

    public String getAppType() {
        return AppType;
    }

    public String getName() {
        return Name;
    }

    public String getSerial() {
        return Serial;
    }

    public String getSnapURL() {
        return SnapURL;
    }

    public String getTag() {
        return Tag;
    }

    public String getTerminalType() {
        return TerminalType;
    }

    public List<Channel> channels = new ArrayList<>();
}