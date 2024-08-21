
package com.example.project;

public class Adapter {
    static {
        System.loadLibrary("interface-jni");
    }

    public native void jniCppAnimal();
    public native void jniRustCountry();
    public native void jniRustCallCppOs();

    public void callAll(){
        this.jniCppAnimal();
        this.jniRustCountry();
        this.jniRustCallCppOs();
    }
}
