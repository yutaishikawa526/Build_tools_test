
cc_library(
    name = "sample",
    srcs = [
        "sample.cpp",
        "sample.h",
    ],
    hdrs = ["sample.h"],
    visibility = ["//visibility:public"],
    deps = [],
    linkstatic = 1,
)

cc_binary (
    name = "main",
    srcs = [
      "main.cpp",
    ],
    deps = [
        "//src:sample",
        "//src/sub:sub_sample",
        "//src/sub2:sub2_sample",
        "//src/sub2/sub:sub2_sub_sample",
    ],
)
