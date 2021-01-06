package com.example.wtf;

/**
 * @description: 请无视
 * @return:
 * @author: Zhanghuairui
 * @date: 2021/1/5
 **/
public class NDKTools {
    static {
        System.loadLibrary("DemoJNI1");
    }
//    public static native int getIntFromNDK();
    public static native int getIntFromNDK();

//    static {
//        System.loadLibrary("getFromCJNI");
//    }
//    public native String getStringFromC(String str);
//    public native Integer getIntegerFromC(Integer i);
//
//    public native boolean getbooleanFromC(boolean flag);
//    public native int getintFromC(int i);
//    public native byte getbyteFromC(byte b);
//    public native long getlongFromC(long l);
}
