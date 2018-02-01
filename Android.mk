LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE_TAGS := optional

LOCAL_SRC_FILES := $(call all-subdir-java-files)

LOCAL_RESOURCE_DIR := $(LOCAL_PATH)/res \
    frameworks/support/v7/cardview/res \
    frameworks/support/v7/recyclerview/res

LOCAL_STATIC_JAVA_LIBRARIES := \
    android-support-v4 \
    android-support-v7-cardview \
    android-support-v7-recyclerview

LOCAL_AAPT_FLAGS := \
    --auto-add-overlay \
    --extra-packages android.support.v7.cardview \
    --extra-packages android.support.v7.recyclerview

LOCAL_PROGUARD_ENABLED := disabled

LOCAL_PACKAGE_NAME := ThemeManager
LOCAL_CERTIFICATE := platform
LOCAL_PRIVILEGED_MODULE := true

include $(BUILD_PACKAGE)
