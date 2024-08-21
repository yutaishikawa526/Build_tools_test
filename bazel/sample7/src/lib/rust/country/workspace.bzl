
# 参考: https://zenn.dev/mixi/articles/0f3d57fc3ff9f2 , https://x1.inkenkun.com/archives/5765 , https://github.com/bazelbuild/rules_rust/blob/main/examples/crate_universe/cargo_local/BUILD.bazel

load("@rules_rust//crate_universe:defs.bzl", "crates_repository")

def workspace():
    crates_repository(
        name = "lib_rust_country_crate_index",
        manifests = ["//src/lib/rust/country:Cargo.toml"],
        cargo_lockfile = "//src/lib/rust/country:Cargo.lock",
    )

lib_rust_country_workspace = workspace
