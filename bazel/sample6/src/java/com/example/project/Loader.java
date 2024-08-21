
// 参考 https://github.com/bazelbuild/bazel/blob/master/src/main/java/com/google/devtools/build/lib/jni/JniLoader.java

package com.example.project;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

public class Loader {
    static {
        String resourceName = "libmain-jni.so";
        String resourcePath = "cpp/" + resourceName;
        Path dir = null;
        Path tempFile = null;
        try {
            dir = Files.createTempDirectory("main_jni");
            tempFile = dir.resolve(resourceName);

            ClassLoader loader = Loader.class.getClassLoader();
            InputStream resource = loader.getResourceAsStream(resourcePath);
            OutputStream diskFile = new FileOutputStream(tempFile.toString());

            BufferedInputStream src  = new BufferedInputStream(resource);
            BufferedOutputStream dest = new BufferedOutputStream(diskFile);
            try{
                int bf;
                while ((bf = src.read()) >= 0){
                    dest.write(bf);
                }
            }catch(Exception e){
                throw e;
            }finally{
                dest.flush();
                src.close();
                dest.close();
            }

            System.load(tempFile.toString());

            Files.delete(tempFile);
            tempFile = null;
            Files.delete(dir);
            dir = null;
        } catch (Exception e) {
            try {
                if (tempFile != null) {
                    Files.deleteIfExists(tempFile);
                }
                if (dir != null) {
                    Files.delete(dir);
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }

            e.printStackTrace();
        }
    }

    public native int jniTest();
}
