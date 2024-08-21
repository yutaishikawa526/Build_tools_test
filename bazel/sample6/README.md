# bazelでjavaからjniを呼び出す

## 手順
```sh

# コンパイル
bazel build //src/java/com/example/project:main

# 実行
bazel run //src/java/com/example/project:main

# jarファイルデプロイ
bazel build //src/java/com/example/project:deploy

# jarファイルの実行
java -jar ./bazel-bin/src/java/com/example/project/deploy.jar

# 掃除
bazel clean

```

## 参考
- https://groups.google.com/g/bazel-discuss/c/fY_hPTGL7To?pli=1
- https://github.com/hlopko/bazel-jni-example/tree/main
- https://github.com/bazelbuild/bazel/blob/master/src/main/java/com/google/devtools/build/lib/jni/JniLoader.java
