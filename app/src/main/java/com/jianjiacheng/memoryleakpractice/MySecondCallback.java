package com.jianjiacheng.memoryleakpractice;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by jianjiacheng on 2017/9/30.
 */

public class MySecondCallback {

    ArrayList<Context> contextArrayList = new ArrayList<>();
    public void unRegister(Context context) {
        contextArrayList.remove(context);
    }

    public void register(Context context) {
        contextArrayList.add(context);
    }
}
