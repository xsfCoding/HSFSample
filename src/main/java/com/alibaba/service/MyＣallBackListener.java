package com.alibaba.service;

import com.taobao.hsf.exception.HSFException;
import com.taobao.hsf.tbremoting.invoke.HSFResponseCallback;

public class MyＣallBackListener implements HSFResponseCallback {
    @Override
    public void onAppException(Throwable throwable) {

    }

    @Override
    public void onAppResponse(Object o) {
        System.out.println("callback"+o);
    }

    @Override
    public void onHSFException(HSFException e) {

    }
}
