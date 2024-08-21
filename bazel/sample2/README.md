# bazelの複数ディレクトリでのコンパイル
サブモジュールは全て静的ライブラリとしてコンパイルする

## 手順
```sh

# コンパイル
bazel build //src:main

# 実行
bazel run //src:main

# 掃除
bazel clean

```
