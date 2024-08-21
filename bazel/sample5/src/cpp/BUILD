
# https://github.com/bazelbuild/bazel/blob/c97c77333cab2b78dc8ac76834fb873389f520d7/src/main/native/BUILD#L4

genrule(
    name = "copy_link_jni_md_header",
    srcs = ["@bazel_tools//tools/jdk:jni_md_header-linux"],
    outs = ["jni_md.h"],
    cmd = "cp -f $< $@",
)

genrule(
    name = "copy_link_jni_header",
    srcs = ["@bazel_tools//tools/jdk:jni_header"],
    outs = ["jni.h"],
    cmd = "cp -f $< $@",
)

cc_library(
    name = "copy_jni_hdr_lib",
    hdrs = [
        "//src/cpp:copy_link_jni_header",
        "//src/cpp:copy_link_jni_md_header",
    ],
    includes = ["."],
)

cc_library(
    name = "main-jni-lib",
    srcs = ["main.cpp"],
    hdrs = ["main.h"],
    deps = ["//src/cpp:copy_jni_hdr_lib"],
    alwayslink = True,
    linkstatic = 0,
    visibility = ["//visibility:public"],
)

cc_binary(
    name = "libmain-jni.so",
    linkshared = True,
    deps = ["//src/cpp:main-jni-lib"],
    visibility = ["//visibility:public"],
)
