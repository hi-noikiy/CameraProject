package com.chinamobile.iot.http;

import rx.functions.Func1;

/**
 * Created by Administrator on 2017/2/22.
 */

public class HttpResultFunc<T> implements Func1<EasyDarwin<T>,T>{
    @Override
    public T call(EasyDarwin<T> easyDarwin) {
        if(!easyDarwin.getHeader().getErrorNum().equals("200")){
            new ApiException(easyDarwin.getHeader().getErrorString());
        }
        return easyDarwin.getBody().getT();
    }
}
