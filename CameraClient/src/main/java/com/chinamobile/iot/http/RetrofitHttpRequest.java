package com.chinamobile.iot.http;

import com.chinamobile.iot.entity.Device;
import com.chinamobile.iot.util.Logger;

import java.util.List;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by malijie on 2017/4/18.
 */

public class RetrofitHttpRequest {
    private static RetrofitHttpRequest sRetrofitRequest = null;
    private RetrofitService mRetrofitService = null;

    private RetrofitHttpRequest(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URLContainer.getBaseURL())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        mRetrofitService = retrofit.create(RetrofitService.class);
    }

    public static RetrofitHttpRequest getInstance(){
        if(sRetrofitRequest == null){
            synchronized (RetrofitHttpRequest.class){
                if(sRetrofitRequest == null){
                    sRetrofitRequest = new RetrofitHttpRequest();
                }
            }
        }
        return sRetrofitRequest;
    }

    public void getDeviceList(String appType,Subscriber subscriber){
        Observable observable = mRetrofitService.getDeviceList(appType);
        Logger.mlj("observable==");
//                .map(new HttpResultFunc<List<Device>>());
//        toSubscribe(observable,subscriber);

    }

    private void toSubscribe(Observable observable, Subscriber subscriber){
        if(observable != null && subscriber != null){
            observable.observeOn(AndroidSchedulers.mainThread())
                    .subscribeOn(Schedulers.newThread())
                    .subscribe(subscriber);
        }
    }
}
