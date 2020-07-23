package com.bc.shop.activity.base;

import com.bc.shop.R;
import com.bc.shop.base.BaseActivity;

import androidx.appcompat.widget.Toolbar;

public class LoginActivity extends BaseActivity {

    private Toolbar mMainTb;

    @Override
    public void initView() {
        setContentView(R.layout.activity_login);
        mMainTb = findViewById(R.id.tb_main);
    }

    @Override
    public void initData() {
        setToolbar(mMainTb, "登录");
    }

    @Override
    public void initEvent() {

    }
}
