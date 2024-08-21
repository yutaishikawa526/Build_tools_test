
java_binary(
    name = "main",
    srcs = [
        "com/example/project/Main.java",
        "com/example/project/Adapter.java"
    ],
    resources = [
        "//src/jni:libinterface-jni.so",
    ],
    deps = [
        "//src/jni:libinterface-jni.so",
    ],
    main_class = "com.example.project.Main",
)

genrule(
    name = "deploy",
    srcs = [
        ":main.jar",
        ":MANIFEST.MF",
    ],
    outs = ["deploy.jar"],
    cmd = "cp $(location :main.jar) $@; jar ufm $@ $(location :MANIFEST.MF)",
    visibility = ["//visibility:public"],
)
