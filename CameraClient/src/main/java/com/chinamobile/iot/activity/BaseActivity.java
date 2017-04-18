package com.chinamobile.iot.activity;

import android.support.v7.app.AppCompatActivity;

import com.chinamobile.iot.view.WaitProgressDialog;

/**
 * Created by malijie on 2017/4/18.
 */

public class BaseActivity extends AppCompatActivity {

    private WaitProgressDialog waitProgressDialog;

    // 显示等待框
    public void showWaitProgress(String message) {
        if (waitProgressDialog == null) {
            waitProgressDialog = new WaitProgressDialog(this);
        }
        waitProgressDialog.showProgress(message);
    }

    public void updateWaitProgress(String message) {
        waitProgressDialog.updateMsg(message);
    }

    // 隐藏等待框
    public void hideWaitProgress() {
        if (waitProgressDialog != null) {
            waitProgressDialog.hideProgress();
        }
    }
}
