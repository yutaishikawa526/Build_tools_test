# bazelでrustを利用する

## 手順
```sh

# コンパイル
bazel build //:main

# 実行
bazel run //:main

# 掃除
bazel clean

```

### 注意
- `Splicing Cargo workspace`に対して約200secほどかかった
