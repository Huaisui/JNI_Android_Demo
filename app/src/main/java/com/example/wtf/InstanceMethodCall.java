package com.example.wtf;

/**
 * @description: C++调用Java测试
 * @return:
 * @author: Zhanghuairui
 * @date: 2021/1/5
 **/
public class InstanceMethodCall {
    static {
        System.loadLibrary("IMC");
    }
    String TAG = "myTAG_InstanceMethodCall";
    private void callJava(){
        System.out.println("callJava");
    }
    public native void nativeMethod();
}
