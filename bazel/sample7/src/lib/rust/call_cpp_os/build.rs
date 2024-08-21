
fn main() {
    // rustに対しても動的リンク必要
    println!("cargo:rustc-link-lib=dylib=stdc++");
}
