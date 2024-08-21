# CMakeのサンプル

## 手順
```sh

# コンパイル用のディレクトリの作成
# ディレクトリをbuild以外を使用するとgitignoreによって無視されなくなる
cmake -S . -B build

# コンパイル
cmake --build build

# 実行
./build/src/main.out

```

## 参考資料
- https://qiita.com/shohirose/items/45fb49c6b429e8b204ac
