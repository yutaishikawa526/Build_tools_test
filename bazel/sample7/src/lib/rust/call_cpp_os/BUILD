
filegroup(
    name = "lib_rust_call_cpp_os_header",
    srcs = ["src/rust_call_cpp_os.h"],
    visibility = ["//visibility:public"],
)

filegroup(
    name = "cargo_toml",
    srcs = ["Cargo.toml"],
)

filegroup(
    name = "rust_srcs",
    srcs = glob(
        ["src/*.rs", "build.rs"],
    ) + [
        "Cargo.lock",
        ":cargo_toml",
    ],
)

genrule(
    name = "_lib_rust_call_cpp_os",
    srcs = [":rust_srcs", ":cargo_toml", "//src/lib/cpp:lib_cpp_os"],
    outs = ["libcall_cpp_os.so"],
    cmd = """
        LIB_TARGET_PATH="`pwd`/$@";
        cd `dirname '$(location :cargo_toml)'`;
        cargo build;
        cp -f target/debug/libcall_cpp_os.so "$$LIB_TARGET_PATH";
        chmod 777 "$$LIB_TARGET_PATH";
    """,
)

cc_import(
    name = "lib_rust_call_cpp_os",
    hdrs = [":lib_rust_call_cpp_os_header"],
    shared_library = ":_lib_rust_call_cpp_os",
    visibility = ["//visibility:public"],
    deps = ["//src/lib/cpp:lib_cpp_os"],
)
