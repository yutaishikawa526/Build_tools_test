
# https://github.com/bazelbuild/bazel/blob/master/src/main/native/BUILD
# https://github.com/bazelbuild/bazel/blob/master/src/main/java/com/google/devtools/build/lib/jni/BUILD

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

#cc_library(
#    name = "copy_jni_hdr_lib",
#    hdrs = [
#        "//src/cpp:copy_link_jni_header",
#        "//src/cpp:copy_link_jni_md_header",
#    ],
#    includes = ["."],
#    copts = [
#        "-fPIC",
#        "-DBLAZE_JAVA_CPU=\"k8\"",
#    ],
#)

cc_binary(
    name = "libmain-jni.so",
    srcs = [
        "main.cpp",
        "main.h",
        ":jni_md.h",
        ":jni.h",
    ],
    includes = ["."],
    linkshared = True,
    visibility = ["//visibility:public"],
    copts = [
        "-fPIC",
        #"-DBLAZE_JAVA_CPU=\"k8\"",
    ],
)

#cc_library(
#    name = "main-jni-lib",
#    srcs = [
#        "main.cpp",
#        "main.h",
#        ":jni_md.h",
#        ":jni.h",
#    ],
#    #deps = ["//src/cpp:copy_jni_hdr_lib"],
#    #linkshared = True,
#    visibility = ["//visibility:public"],
#    includes = ["."],
#    linkstatic = 1,
#)
#
#cc_binary(
#    name = "libmain-jni.so",
#    linkshared = True,
#    deps = ["//src/cpp:main-jni-lib"],
#    visibility = ["//visibility:public"],
#    copts = [
#        "-fPIC",
#        #"-DBLAZE_JAVA_CPU=\"k8\"",
#    ],
#)
