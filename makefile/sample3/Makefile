CC       = clang
CFLAGS   = -std=c++17
LIBDIR   = -lstdc++
LIBS     =

SRCS     = main.cpp sample.cpp sub2/sub_sample.cpp sub2/sub/sub_sample.cpp sub/sub_sample.cpp
OBJS     = $(SRCS:.cpp=.o)

TARGET   = makefile_test.o
FORMAT_F = $(shell find . -type f | grep -E '^\./.+\.(cpp|h)$$')

.cpp.o:
	$(CC) $(CFLAGS) -c $^ -o $@

clean:
	-rm -f $(OBJS) $(TARGET)

format: $(FORMAT_F)
	clang-format --style=file:.clang-format -i $^

setting:
	apt install $(CC) clang-format

$(TARGET): $(OBJS)
	$(CC) -o $@ $^ $(LIBDIR) $(LIBS) $(CFLAGS)

all: $(TARGET)
