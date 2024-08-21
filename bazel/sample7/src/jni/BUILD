
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

cc_binary(
    name = "libinterface-jni.so",
    srcs = [
        "interface.cpp",
        "interface.h",
        ":jni_md.h",
        ":jni.h",
        "//src/lib/cpp:lib_cpp_animal_header",
        "//src/lib/rust/country:lib_rust_country_header",
        "//src/lib/rust/call_cpp_os:lib_rust_call_cpp_os_header",
    ],
    deps = [
        "//src/lib/cpp:lib_cpp_animal",
        "//src/lib/cpp:lib_cpp_os",
        "//src/lib/rust/country:lib_rust_country",
        "//src/lib/rust/call_cpp_os:lib_rust_call_cpp_os",
    ],
    includes = ["."],
    linkshared = True,
    visibility = ["//visibility:public"],
    copts = [
        "-fPIC",
    ],
)
