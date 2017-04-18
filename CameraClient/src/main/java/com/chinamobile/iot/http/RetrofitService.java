package com.chinamobile.iot.http;

import com.chinamobile.iot.entity.Device;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by malijie on 2017/4/18.
 */

public interface RetrofitService {

    @GET("getdevicelist")
    Observable<EasyDarwin<List<Device>>> getDeviceList(@Query("AppType") String appType);

}
