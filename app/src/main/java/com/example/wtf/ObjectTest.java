package com.example.wtf;

/**
 * @description: 对象测试
 * @return:
 * @author: Zhanghuairui
 * @date: 2021/1/5
 **/

public class ObjectTest {
    static {
        System.loadLibrary("ObjectJNI");
    }
    public native int Obj1();
    private String id;
    private int age;

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }
}
