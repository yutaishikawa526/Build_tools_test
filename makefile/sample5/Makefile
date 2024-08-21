# コンパイル設定
CC       = clang
CFLAGS   = -std=c++17
LIBDIR   = -lstdc++
LIBS     =

# ソースファイル(.cpp)
DIRS     = *.suffix */*.suffix */*/*.suffix */*/*/*.suffix */*/*/*/*.suffix */*/*/*/*/*.suffix
SRCS     = $(wildcard $(DIRS:%.suffix=%.cpp))

# オブジェクトファイル(.o)、依存関係ファイル(.d)、出力ファイル
B_DIR    = build/
OBJS     = $(SRCS:%.cpp=$(B_DIR)%.o)
DEPS     = $(SRCS:%.cpp=$(B_DIR)%.d)
TARGET   = $(B_DIR)makefile_test.o

# フォーマット対象ファイル(.cpp .h)
FORMAT_F = $(wildcard $(DIRS:%.suffix=%.cpp) $(DIRS:%.suffix=%.h))

$(B_DIR)%.o: %.cpp
	@mkdir -p $(@D)
	$(CC) -c $*.cpp -o $@ -MMD $(CFLAGS)

$(TARGET): $(OBJS)
	$(CC) $^ -o $@ $(LIBDIR) $(LIBS) $(CFLAGS)

clean:
	-rm -fr $(B_DIR)

format: $(FORMAT_F)
	clang-format --style=file:.clang-format -i $^

setting:
	apt install $(CC) clang-format

all: $(TARGET)

-include $(DEPS)