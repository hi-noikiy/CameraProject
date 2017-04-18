package com.chinamobile.iot.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.LayoutInflater;
import android.view.View;

import com.chinamobile.iot.CameraClientApp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by malijie on 2017/2/24.
 */

public class Util {
    public static boolean hasInternet(){
        ConnectivityManager connectivity = (ConnectivityManager) CameraClientApp.sContext
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity != null) {
            NetworkInfo info = connectivity.getActiveNetworkInfo();
            if (info != null && info.isConnected()){
                if (info.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }
        }
        return false;
    }


    public static String getResString(int resId){
        return CameraClientApp.sContext.getResources().getString(resId);
    }

    public static View getView(int resId){
        return LayoutInflater.from(CameraClientApp.sContext).inflate(resId,null);
    }

    public static String getCurrentDate(){
        return  new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
    }


    public static int getColor(int resColor){
        return CameraClientApp.sContext.getResources().getColor(resColor);
    }

}
