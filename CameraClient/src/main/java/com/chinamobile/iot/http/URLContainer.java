package com.chinamobile.iot.http;

/**
 * Created by malijie on 2017/2/22.
 */

public class URLContainer {
    //http://121.40.50.44:10000/api/v1/getdevicelist?AppType=EasyNVR
    private static final String BASE_URL = "http://121.40.50.44:10000/api/v1/";
    public static String getBaseURL(){
        return BASE_URL;
    }
}
