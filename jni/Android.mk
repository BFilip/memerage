LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := fluxiplex
LOCAL_SRC_FILES := fluxiplex.cpp

include $(BUILD_SHARED_LIBRARY)
