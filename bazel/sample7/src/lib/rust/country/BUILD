
load("@lib_rust_country_crate_index//:defs.bzl", "all_crate_deps", "crate_repositories")

crate_repositories()

load("@rules_rust//rust:defs.bzl", "rust_library", "rust_binary")

#rust_library(
#    name = "_lib_rust_country",
#    srcs = glob(["src/*.rs"]),
#    edition = "2021",
#    deps = all_crate_deps(normal = True),
#    visibility = ["//visibility:public"],
#)

filegroup(
    name = "lib_rust_country_header",
    srcs = ["src/rust_country.h"],
    visibility = ["//visibility:public"],
)

#genrule(
#    name = "_lib_rust_country",
#    srcs = glob(["src/*.rs"]) + ["Cargo.lock", "Cargo.toml"],
#    outs = ["libcountry.so"],
#    cmd = "cd `dirname $(location :Cargo.toml)`;cargo build;mkdir -p --mode=777 `dirname $@` ;cp -f target/debug/deps/libcountry.so $@;chmod 777 $@;",
#)

#genrule(
#    name = "__lib_rust_country",
#    srcs = glob(["**/*.rs"]) + ["Cargo.lock", "Cargo.toml"],
#    outs = ["target/debug/deps/libcountry.so"],
#    cmd = "cd `dirname '$(location :Cargo.toml)'`;cargo build;echo '------------------';ls -l;echo '------------------';pwd;echo '------------------';ls -l target/debug/deps;echo '------------------';echo $@;echo '------------------';ls `dir $@` -l;echo '------------------';cp -f target/debug/deps/libcountry.so $@ || echo 'False';echo '------------------';ls `dir $@` -l;echo '------------------';",
#)
#
#genrule(
#    name = "_lib_rust_country",
#    srcs = [":__lib_rust_country"],
#    outs = ["libcountry.so"],
#    cmd = "cp -f $< $@",
#)

filegroup(
    name = "cargo_toml",
    srcs = ["Cargo.toml"],
)

filegroup(
    name = "rust_srcs",
    srcs = glob(
        ["src/*.rs"],
    ) + [
        "Cargo.lock",
        ":cargo_toml",
    ],
)

genrule(
    name = "_lib_rust_country",
    srcs = [":rust_srcs", ":cargo_toml"],
    outs = ["libcountry.so"],
    cmd = """
        LIB_TARGET_PATH="`pwd`/$@";
        cd `dirname $(location :cargo_toml)`;
        cargo build;
        cp -f target/debug/libcountry.so "$$LIB_TARGET_PATH";
        chmod 777 "$$LIB_TARGET_PATH";
    """,
)

#genrule(
#    name = "_lib_rust_country",
#    srcs = [":__lib_rust_country"],
#    outs = ["libcountry.so"],
#    cmd = "cp -f $< $@)",
#    #cmd = "cp $(location :main.jar) $@; jar ufm $@ $(location :MANIFEST.MF)",
#)

#rust_binary(
#    name = "_lib_rust_country",
#    srcs = glob(["src/*.rs"]),
#    edition = "2021",
#    deps = all_crate_deps(normal = True),
#    visibility = ["//visibility:public"],
#    crate_type = "cdylib",
#    #out_binary = True,
#    #alwayslink = True,
#    compile_data = ["Cargo.toml"],
#    #platform = "@rules_rust//rust/platform:wasm",
#)

cc_import(
    name = "lib_rust_country",
    hdrs = [":lib_rust_country_header"],
    # libmylib.ifso is an interface library for libmylib.so which will be passed to linker
    # interface_library = "libmylib.ifso",
    shared_library = ":_lib_rust_country",
    visibility = ["//visibility:public"],
)
