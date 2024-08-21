
# 実行ファイル
bin_PROGRAMS = main

# C++コンパイラオプション
main_CXXFLAGS = -g

# ソースコード
main_SOURCES = main.cpp sample.h sample.cpp

# サブディレクトリ
SUBDIRS = sub sub2

# ライブラリの指定
main_LDADD = sub/libsub.la sub2/libsub2.la sub2/sub/libsub2_sub.la
main_LDFLAGS = -static
