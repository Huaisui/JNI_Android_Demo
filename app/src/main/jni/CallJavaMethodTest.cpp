#include <cstdlib>
#include "com_example_wtf_InstanceMethodCall.h"

/**
 * @description: C++调用java
 * @return:
 * @author: Zhanghuairui
 * @date: 2021/1/5
 **/

JNIEXPORT void JNICALL Java_com_example_wtf_InstanceMethodCall_nativeMethod
(JNIEnv *env, jobject obj){
    jclass cls = env->GetObjectClass(obj);
    jmethodID jm = env->GetMethodID(cls,"callJava","()V");
    env->CallVoidMethod(obj,jm);
}