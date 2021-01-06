#include "com_example_wtf_ObjectTest.h"
#include <iostream>
#include <cstdlib>
using namespace std;

/**
 * @description: 对象测试
 * @return:
 * @author: Zhanghuairui
 * @date: 2021/1/5
 **/

JNIEXPORT jint JNICALL Java_com_example_wtf_ObjectTest_Obj1(JNIEnv *env, jobject obj){
    jfieldID fid_id, fid_age;
    jstring jstr; jint ji;
    const char *str;

    jclass cl = env->GetObjectClass(obj);
    cout << "in C: " << endl;

    fid_id = env->GetFieldID(cl,"id","Ljava/lang/String;");
    fid_age = env->GetFieldID(cl,"age", "I");

    jstr = (jstring)env->GetObjectField(obj,fid_id);
    str = env->GetStringUTFChars(jstr,NULL);
    ji = env->GetIntField(obj,fid_age);
    return ji;
}