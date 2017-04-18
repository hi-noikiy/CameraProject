package com.chinamobile.iot.activity;

import android.support.v4.widget.SwipeRefreshLayout;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.GridView;
import android.widget.Toast;

import com.chinamobile.iot.R;
import com.chinamobile.iot.entity.Device;
import com.chinamobile.iot.entity.DeviceListBody;
import com.chinamobile.iot.http.RetrofitHttpRequest;
import com.chinamobile.iot.http.SubscriberOnNextListener;
import com.chinamobile.iot.util.Logger;
import com.chinamobile.iot.util.SharePreferenceUtil;

import java.util.ArrayList;
import java.util.List;

import rx.observers.SafeSubscriber;

public class NVRActivity extends BaseActivity {
    private GridView mGridView = null;
    private SwipeRefreshLayout mSwipeRefreshLayout = null;
    private String mServerIp;
    private String mServerPort;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nvr_activity);
        initView();
        initData();
    }

    private void initData(){
        mServerIp = SharePreferenceUtil.getServerIP();
        mServerPort = SharePreferenceUtil.getServerPort();
        getDevices();
    }

    private void initView(){
        mGridView = (GridView) findViewById(R.id.id_gv);
        mSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swip_refersh);
    }

    /**
     * 获取直播地址列表
     */
    private void getDevices() {


        RetrofitHttpRequest.getInstance().getDeviceList("EasyNVR",new SubscriberOnNextListener<List<Device>>(){
            @Override
            public void onNext(List<Device> devices) {
                super.onNext(devices);
                Logger.mlj("devices=" + devices);
            }
        });
    }
}
