#                                               -*- Autoconf -*-
# Process this file with autoconf to produce a configure script.

AC_PREREQ([2.71])
AC_CONFIG_SRCDIR([src/main.cpp])
AC_CONFIG_HEADERS([config.h])

# ############################################
# autoscanで生成されるscanファイルからの変更点
# 適切に変更
AC_INIT([testtest], [1.0.0], [samle@example.com])
# 以下の指定が必要
AM_INIT_AUTOMAKE( [foreign] )
# ライブラリ作成に必要
LT_INIT
AC_CONFIG_MACRO_DIRS([m4])
# ############################################

# Checks for programs.
AC_PROG_CXX
AC_PROG_CC

# Checks for libraries.

# Checks for header files.

# Checks for typedefs, structures, and compiler characteristics.

# Checks for library functions.

AC_CONFIG_FILES([Makefile
                 src/Makefile
                 src/sub/Makefile
                 src/sub2/Makefile
                 src/sub2/sub/Makefile])
AC_OUTPUT
