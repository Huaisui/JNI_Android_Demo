#include "com_example_wtf_getFromC.h"
#include <cstring>
#include <iostream>
/**
 * @description: 基础类型测试
 * @return:
 * @author: Zhanghuairui
 * @date: 2021/1/5
 **/
using namespace std;

JNIEXPORT jstring JNICALL Java_com_example_wtf_getFromC_getStringFromC(JNIEnv *env, jobject obj, jstring string){
    const char *str = env->GetStringUTFChars(string,0);
    char c[128];
    strcpy(c,str);
    env->ReleaseStringUTFChars(string,str);
    int i = 0;
    for (int i = 0; i < strlen(c); ++i){
    	*(c+i) = (char)(*(c+i)+1);
    }
    return env->NewStringUTF(c);
}

JNIEXPORT jobject JNICALL Java_com_example_wtf_getFromC_getIntegerFromC(JNIEnv *env, jobject obj, jobject myobj){

}

JNIEXPORT jboolean JNICALL Java_com_example_wtf_getFromC_getbooleanFromC(JNIEnv *env, jobject obj, jboolean b){
    if (b == true) b = false;
    else b = true;
    return b;
}

JNIEXPORT jint JNICALL Java_com_example_wtf_getFromC_getintFromC(JNIEnv *env, jobject obj, jint i){
    return i+1;
}

JNIEXPORT jbyte JNICALL Java_com_example_wtf_getFromC_getbyteFromC(JNIEnv *env, jobject obj, jbyte b){
    if (b > 10) b = 127;
    return b;
}

JNIEXPORT jlong JNICALL Java_com_example_wtf_getFromC_getlongFromC(JNIEnv *env, jobject obj, jlong l){
    if (l < 100){
        l = 111111;
    }
    return l;
}
