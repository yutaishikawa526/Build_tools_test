
load("@crate_index//:defs.bzl", "all_crate_deps")
load("@rules_rust//rust:defs.bzl", "rust_binary")

rust_binary(
    name = "main",
    srcs = glob(["**/*.rs"]),
    edition = "2021",
    deps = all_crate_deps(normal = True),
)
