
# ライブラリを追加する
add_library(
    sub STATIC
        sub_sample.cpp
        sub_sample.h
)

# ライブラリのインクルードディレクトリを指定
# PROJECT_SOURCE_DIRはプロジェクトのルートディレクトリの絶対パス
target_include_directories(
    sub PUBLIC
        ${PROJECT_SOURCE_DIR}/src/sub
)
