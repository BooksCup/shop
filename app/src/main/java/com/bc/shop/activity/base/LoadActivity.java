package com.bc.shop.activity.base;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import com.bc.shop.R;
import com.bc.shop.base.BaseActivity;
import com.bc.shop.base.BaseConstant;


public class LoadActivity extends BaseActivity {

    @Override
    public void initView() {
        setContentView(R.layout.activity_load);
        startMain();
    }

    @Override
    public void initData() {

    }

    @Override
    public void initEvent() {

    }

    private void startMain() {
        new CountDownTimer(BaseConstant.TIME_COUNT, BaseConstant.TIME_TICK) {

            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                startActivity(new Intent(getActivity(), LoginActivity.class));
                finish();
            }
        }.start();
    }
}
