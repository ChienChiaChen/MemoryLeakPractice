package com.jianjiacheng.memoryleakpractice;

import android.content.Context;

/**
 * Created by jianjiacheng on 2017/9/30.
 */

public class MyFirstCallback {
    private MySecondCallback mySecondCallback=new MySecondCallback();

    public void addMySecondCallback(Context context) {
        mySecondCallback.register(context);
    }

    public void removeMySecondCallback(Context context){
        mySecondCallback.unRegister(context);
    }
}
