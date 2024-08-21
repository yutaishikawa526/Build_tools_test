CC       = clang
CFLAGS   = -std=c++17
LIBDIR   = -lstdc++
LIBS     =

SRCS     = main.cpp sample.cpp
#SRCS     = $(shell find . -mindepth 1 -maxdepth 1 -type f | grep -E '.+\.cpp$$')
OBJS     = $(SRCS:.cpp=.o)

TARGET   = makefile_test.o
FORMAT_F = $(shell find . -type f | grep -E '^\./.+\.(cpp|h)$$')

$(OBJS): $(SRCS)
	$(CC) $(INCDIR) -c $^

compile: $(OBJS)
	find . -mindepth 2 -maxdepth 2 -type f | grep -E '^.*/Makefile$$' | xargs -I subD bash -c 'cd `dirname subD`; make compile'

clean:
	-rm -f $(OBJS)
	find . -mindepth 2 -maxdepth 2 -type f | grep -E '^.*/Makefile$$' | xargs -I subD bash -c 'cd `dirname subD`; make clean'
	-rm -f $(TARGET)

format: $(SRCS)
	clang-format --style=file:.clang-format -i $(FORMAT_F)

setting:
	apt install $(CC) clang-format

$(TARGET): $(OBJS) compile
	$(CC) -o $@ `find . -type f | grep -E '.+\.o$$' | grep -v $(TARGET) ` $(LIBDIR) $(LIBS) $(CFLAGS)

all: $(TARGET)
