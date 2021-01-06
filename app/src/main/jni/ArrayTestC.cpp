#include "com_example_wtf_ArrayTest.h"
#include <cstdlib>
#include <iostream>

using namespace std;
/**
 * @description: 数组测试
 * @return:
 * @author: Zhanghuairui
 * @date: 2021/1/5
 **/
JNIEXPORT jintArray JNICALL Java_com_example_wtf_ArrayTest_intMethod(JNIEnv *env, jobject obj, jintArray array){
    int len = env->GetArrayLength(array);
    jint *p = env->GetIntArrayElements(array,NULL);
    jintArray newArray;
    newArray = env->NewIntArray(len);

    int sum = 0;
    for (int i = 0; i < len; i++){
        sum += p[i];
    }
    jint values[5] = {sum,0,0,0,0};
    env->SetIntArrayRegion(newArray, 0, 5, values);
    //env->ReleaseIntArrayElements(newArray, values, NULL);
    cout << sum << endl;
    return newArray;
}