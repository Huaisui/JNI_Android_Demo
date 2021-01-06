LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)
LOCAL_MODULE := DemoJNI1
LOCAL_SRC_FILES := JNI1.cpp
include $(BUILD_SHARED_LIBRARY)

#getFromC
include $(CLEAR_VARS)
LOCAL_MODULE := getFromJNI
LOCAL_SRC_FILES := getFromC.cpp
include $(BUILD_SHARED_LIBRARY)

include $(CLEAR_VARS)
LOCAL_MODULE := MMPCJNI
LOCAL_SRC_FILES := MMPC.cpp
include $(BUILD_SHARED_LIBRARY)

include $(CLEAR_VARS)
LOCAL_MODULE := ArrayC
LOCAL_SRC_FILES := ArrayTestC.cpp
include $(BUILD_SHARED_LIBRARY)

include $(CLEAR_VARS)
LOCAL_MODULE := ObjectJNI
LOCAL_SRC_FILES := ObjTest.cpp
include $(BUILD_SHARED_LIBRARY)

include $(CLEAR_VARS)
LOCAL_MODULE := IMC
LOCAL_SRC_FILES := CallJavaMethodTest.cpp
include $(BUILD_SHARED_LIBRARY)