package com.bc.shop.activity.base;

import com.bc.shop.R;
import com.bc.shop.base.BaseActivity;

import androidx.appcompat.widget.Toolbar;

public class LoginActivity extends BaseActivity {

    private Toolbar mainToolbar;

    @Override
    public void initView() {
        setContentView(R.layout.activity_login);
        mainToolbar = findViewById(R.id.mainToolbar);
    }

    @Override
    public void initData() {
        setToolbar(mainToolbar, "登录");
    }

    @Override
    public void initEvent() {

    }
}
