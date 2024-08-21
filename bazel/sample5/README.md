# bazelでjavaからjniを呼び出す

## 手順
```sh

# コンパイル
bazel build //src/java:main

# 実行
bazel run //src/java:main

# 掃除
bazel clean

```

## 参考
- https://groups.google.com/g/bazel-discuss/c/fY_hPTGL7To?pli=1
- https://github.com/hlopko/bazel-jni-example/tree/main
