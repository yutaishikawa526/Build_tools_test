# Java,JNI,C,C++,Rustを使用したモノレポ環境の構築
最初の呼び出しがJavaで、JavaからJNIを通して、Rust,C++を呼び出す\
またRustからCを呼び出す処理も実装

## 手順
```sh

# ビルド
bazel build //src/java:main

# 実行
bazel run //src/java:main

# [src/lib/*]で実装のライブラリのテスト
bazel run //src/lib/test:lib_test

# デプロイ用のJarファイル作成
# [bazel-bin/src/java/deploy.jar]にJarファイルが作成される
# ただし、C,Rust,JNI,C++の動的ライブラリを適切な場所に設置する必要がある
bazel build //src/java:deploy

```

## 構造
- 未記載

## その他

### Rustについて
- `rust_library`や`rust_binary`を使用した、`--crate-type=cdylib`の動的ライブラリの作成方法がわからなかったため、\
    Cargoを直接利用してコンパイルしている
- [src/lib/rust/country/](./src/lib/rust/country/)は`rust_library`や`rust_binary`を使用するコンパイルの実験を繰り返している跡がある
