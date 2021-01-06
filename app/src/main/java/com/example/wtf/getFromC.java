package com.example.wtf;

/**
 * @description: 基础类型测试
 * @return:
 * @author: Zhanghuairui
 * @date: 2021/1/5
 **/

public class getFromC {
    static {
        System.loadLibrary("getFromJNI");
    }
    public native String getStringFromC(String str);
    public native Integer getIntegerFromC(Integer i);

    public native boolean getbooleanFromC(boolean flag);
    public native int getintFromC(int i);
    public native byte getbyteFromC(byte b);
    public native long getlongFromC(long l);

}
