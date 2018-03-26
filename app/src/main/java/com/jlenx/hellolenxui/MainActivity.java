package com.jlenx.hellolenxui;

import com.jlenx.core.android.ui.BaseActivity;
import com.jlenx.core.android.ui.interf.IBasePresenter;


public class MainActivity extends BaseActivity {


    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected IBasePresenter initPresenter() {
        return null;
    }

    @Override
    public void initView() {

    }
}
