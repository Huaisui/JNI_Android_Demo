package com.example.wtf;

/**
 * @description: nothing
 * @return:
 * @author: Zhanghuairui
 * @date: 2021/1/5
 **/
public class MMP {
    static {
        System.loadLibrary("MMPCJNI");
    }

    public native String getStringFromC(String str);
    public native int getintFromC(int i);
}
