package com.bc.shop.base;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;

import com.bc.shop.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;

public abstract class BaseActivity extends AppCompatActivity {

    private Activity activity;

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = this;
        initView();
        initData();
        initEvent();
    }

    public abstract void initView();

    public abstract void initData();

    public abstract void initEvent();

    public void onReturn() {
        finish();
    }

    public Activity getActivity() {
        return activity;
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        setContentView(LayoutInflater.from(this).inflate(layoutResID, null));
    }

    public void setToolbar(Toolbar toolbar, String title) {
        toolbar.setTitle("");
        toolbar.setNavigationIcon(R.drawable.ic_action_back);

        if (!TextUtils.isEmpty(title)) {
            AppCompatTextView appCompatTextView = findViewById(R.id.tv_title);
            appCompatTextView.setText(title);
        }

        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onReturn();
            }
        });

    }
}
