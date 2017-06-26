package com.example.g572_528r.wuziqi;

import android.app.Application;
import android.content.Context;

import cn.bmob.v3.Bmob;

/**
 * Created by yhdj on 2017/5/12.
 */

public class MyApplication extends Application {
    private static Context mContext;

    @Override
    public void onCreate() {
        mContext = getApplicationContext();
        Bmob.initialize(this, "0689c844f703451afaa13641297e9a7f");

    }

    public static Context getContext() {
        return mContext;
    }
}
