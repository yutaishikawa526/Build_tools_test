#include <jni.h>

#include "interface.h"

#include "../lib/cpp/cpp_animal.h"
#include "../lib/rust/country/src/rust_country.h"
#include "../lib/rust/call_cpp_os/src/rust_call_cpp_os.h"

JNIEXPORT void JNICALL Java_com_example_project_Adapter_jniCppAnimal(JNIEnv *, jobject) {
    lib_cpp_animal();
}

JNIEXPORT void JNICALL Java_com_example_project_Adapter_jniRustCountry(JNIEnv *, jobject) {
    lib_rust_country();
}

JNIEXPORT void JNICALL Java_com_example_project_Adapter_jniRustCallCppOs(JNIEnv *, jobject) {
    lib_rust_call_cpp_os();
}
