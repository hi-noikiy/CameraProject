package com.chinamobile.iot.util;

import android.content.Context;

import com.chinamobile.iot.CameraClientApp;

/**
 * Created by malijie on 2016/10/10.
 */
public class SharePreferenceUtil {
    public static final String SP_SERVER_INFO = "server_info";
    public static final String SERVER_IP_KEY = "server_ip";
    public static final String SERVER_PORT_KEY = "server_port";


    public static void setServerIP(String serverIP){
        CameraClientApp.sContext.getSharedPreferences(SP_SERVER_INFO, Context.MODE_PRIVATE).edit()
                .putString(SERVER_IP_KEY,serverIP).commit();
    }

    public static String getServerIP(){
        return CameraClientApp.sContext.getSharedPreferences(SP_SERVER_INFO, Context.MODE_PRIVATE)
                .getString(SERVER_IP_KEY,"");
    }

    public static void setServerPort(String serverPort){
        CameraClientApp.sContext.getSharedPreferences(SP_SERVER_INFO, Context.MODE_PRIVATE).edit()
                .putString(SERVER_PORT_KEY,serverPort).commit();
    }

    public static String getServerPort(){
        return CameraClientApp.sContext.getSharedPreferences(SP_SERVER_INFO, Context.MODE_PRIVATE)
                .getString(SERVER_PORT_KEY,"");
    }

}
