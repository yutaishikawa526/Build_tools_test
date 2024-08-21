#include <jni.h>

#ifndef MAIN_H
#define MAIN_H

#ifdef __cplusplus
extern "C" {
#endif

JNIEXPORT jint JNICALL Java_Main_jniTest(JNIEnv *, jobject);

#ifdef __cplusplus
}
#endif

#endif
