
filegroup(
    name = "lib_cpp_animal_header",
    srcs = ["cpp_animal.h"],
    visibility = ["//visibility:public"],
)

filegroup(
    name = "lib_cpp_os_header",
    srcs = ["cpp_os.h"],
    visibility = ["//visibility:public"],
)

cc_library(
    name = "lib_cpp_animal",
    srcs = [
        "cpp_animal.cpp",
        ":lib_cpp_animal_header",
    ],
    hdrs = [":lib_cpp_animal_header"],
    visibility = ["//visibility:public"],
    linkstatic = 0,
    copts = [
        "-fPIC",
    ],
)

cc_library(
    name = "lib_cpp_os",
    srcs = [
        "cpp_os.cpp",
        ":lib_cpp_os_header",
    ],
    hdrs = [":lib_cpp_os_header"],
    visibility = ["//visibility:public"],
    linkstatic = 0,
    copts = [
        "-fPIC",
    ],
)
