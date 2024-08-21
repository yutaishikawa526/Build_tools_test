CC       = clang
CFLAGS   = -std=c++17
LIBDIR   = -lstdc++
LIBS     =

TARGET   = makefile_test.o
SRCS     = main.cpp sample.cpp
OBJS     = main.o sample.o
# OBJS     = $(SRCS:.cpp=.o)
SUB_SRCS = sub/sub_sample.cpp
SUB_OBJS = sub_sample.o
SUB2_SRCS = sub2/sub_sample.cpp
SUB2_OBJS = sub2_sample.o
FORMAT_F = main.cpp sample.cpp sub/sub_sample.cpp sub2/sub_sample.cpp sample.h sub/sub_sample.h sub2/sub_sample.h
#FORMAT_F = $(shell find . -type f | grep -E '^\./.+\.(cpp|h)$$')

$(TARGET): $(OBJS) $(SUB_OBJS) $(SUB2_OBJS)
	$(CC) -o $@ $^ $(LIBDIR) $(LIBS) $(CFLAGS)

$(OBJS): $(SRCS)
	$(CC) $(INCDIR) -c $^

$(SUB_OBJS): $(SUB_SRCS)
	$(CC) $(INCDIR) -c $^ -o $(SUB_OBJS)

$(SUB2_OBJS): $(SUB2_SRCS)
	$(CC) $(INCDIR) -c $^ -o $(SUB2_OBJS)

all: $(OBJS) $(TARGET) $(SUB_OBJS) $(SUB2_OBJS)

clean:
	-rm -f $(OBJS) $(TARGET) $(SUB_OBJS) $(SUB2_OBJS)

setting:
	apt install $(CC) clang-format

format:
	clang-format --style=file:.clang-format -i $(FORMAT_F)
