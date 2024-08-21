# autoconfのテスト
autoconfを使用したmakefileの作成からコンパイルまで

## 手順
```sh

# configureファイルの作成
# [autoreconf --install]で以下4コマンドを代用可能
libtoolize -c
aclocal
autoheader
automake --add-missing
autoconf

# configureの実行
./configure

# makeの実行
make

# 実行
./src/main

```

## 参考サイト
- https://htakeuchi0.github.io/docs/cpp/env/autoconf2/
