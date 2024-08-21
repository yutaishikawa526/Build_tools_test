
# サブディレクトリを登録
add_subdirectory(sub)
add_subdirectory(sub2)

# 実行ファイルを指定
add_executable(main.out main.cpp sample.cpp sample.h)

# main.outをコンパイルする際に以下をリンクする
target_link_libraries(main.out sub sub2 sub2_sub)
