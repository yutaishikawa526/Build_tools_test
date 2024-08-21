
java_binary(
    name = "main",
    srcs = ["Main.java"],
    data = [
        "//src/cpp:libmain-jni.so",
        "//src/cpp:main-jni-lib",
    ],
    jvm_flags = ["-Djava.library.path=src/cpp"],
    main_class = "Main",
)
