package com.chinamobile.iot;

import android.app.Application;
import android.content.Context;

/**
 * Created by malijie on 2017/4/18.
 */

public class CameraClientApp extends Application{
    public static Context sContext = null;
    @Override
    public void onCreate() {
        super.onCreate();
        sContext = getApplicationContext();
    }
}
