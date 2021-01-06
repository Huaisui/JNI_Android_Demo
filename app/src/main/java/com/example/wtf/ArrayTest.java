package com.example.wtf;

/**
 * @description: 数组测试
 * @return:
 * @author: Zhanghuairui
 * @date: 2021/1/5
 **/

public class ArrayTest {
    static {
        System.loadLibrary("ArrayC");
    }

    public native int[] intMethod(int[] array);
}
