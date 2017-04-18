package com.chinamobile.iot.activity;

import android.support.v4.widget.SwipeRefreshLayout;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.GridView;
import android.widget.Toast;

import com.chinamobile.iot.R;
import com.chinamobile.iot.entity.DeviceListBody;
import com.chinamobile.iot.util.Logger;
import com.chinamobile.iot.util.SharePreferenceUtil;

import java.util.ArrayList;
import java.util.List;

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
//        getDevices(mServerIp, mServerPort);
    }

    private void initView(){
        mGridView = (GridView) findViewById(R.id.id_gv);
        mSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swip_refersh);
        showWaitProgress("");
    }

    /**
     * 获取直播地址列表
     *
     * @param ip   服务器地址
     * @param port 服务器端口号
     */
    private void getDevices(String ip, String port) {
        if (TextUtils.isEmpty(ip) || TextUtils.isEmpty(port)) {
            return;
        }

        String url = String.format("http://%s:%s/api/v1/getdevicelist?AppType=EasyNVR", ip, port);
        Logger.mlj("nvr url=" + url);
    }
}
