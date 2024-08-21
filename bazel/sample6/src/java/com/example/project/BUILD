
java_binary(
    name = "main",
    srcs = [
        "Main.java",
        "Loader.java",
    ],
    main_class = "com.example.project.Main",
    resources = [
        "//src/cpp:libmain-jni.so",
    ],
    deps = ["//src/cpp:libmain-jni.so"],
    #deploy_manifest_lines = ["Main-Class: com.example.project.Main"],
    #jvm_flags = ["-Djava.library.path=src/cpp"],
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

#genrule(
#    name = "tmp_test",
#    srcs = [":main"],
#    outs = ["test.txt"],
#    visibility = ["//visibility:public"],
#    cmd = "echo '$(SRCS)' > $(location :test.txt)",
#)
