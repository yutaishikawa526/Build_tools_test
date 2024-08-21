#include <jni.h>

#include "main.h"

JNIEXPORT jint JNICALL Java_Main_jniTest(JNIEnv *, jobject) {
    return 99;
}