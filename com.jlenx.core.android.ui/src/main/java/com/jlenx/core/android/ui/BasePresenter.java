package com.jlenx.core.android.ui;

import android.content.Context;

import com.jlenx.core.android.rx.RxManager;
import com.jlenx.core.android.ui.interf.IBasePresenter;
import com.jlenx.core.android.ui.interf.IBaseView;


public abstract class BasePresenter<T extends IBaseView> implements IBasePresenter {
    private Context mContext;
    private T mView;
    private RxManager mRxManage = new RxManager();


    public BasePresenter(Context mContext, T mView) {
        this.mContext = mContext;
        this.mView = mView;
        this.onStart();
    }


    public Context getContext() {
        return mContext;
    }


    public T getView() {
        return mView;
    }

    public RxManager getRxManage() {
        return mRxManage;
    }

    public void onStart() {
    }

    public void onDestroy() {
        mRxManage.clear();
    }
}
