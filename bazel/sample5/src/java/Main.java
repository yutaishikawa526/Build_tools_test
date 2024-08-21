public class Main {
    static {
        System.loadLibrary("main-jni");
    }

    private native int jniTest();

    public static void main(String[] args) {
        System.out.println(new Main().jniTest());
    }
}