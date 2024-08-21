
cc_binary (
    name = "lib_test",
    srcs = [
        "test.cpp",
        "//src/lib/cpp:lib_cpp_animal_header",
        "//src/lib/cpp:lib_cpp_os_header",
        "//src/lib/rust/country:lib_rust_country_header",
        "//src/lib/rust/call_cpp_os:lib_rust_call_cpp_os_header",
    ],
    deps = [
        "//src/lib/cpp:lib_cpp_animal",
        "//src/lib/cpp:lib_cpp_os",
        "//src/lib/rust/country:lib_rust_country",
        "//src/lib/rust/call_cpp_os:lib_rust_call_cpp_os",
    ],
)
