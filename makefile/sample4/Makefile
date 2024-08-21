CC       = clang
CFLAGS   = -std=c++17
LIBDIR   = -lstdc++
LIBS     =

DIRS     = *.sufix */*.sufix */*/*.sufix */*/*/*.sufix */*/*/*/*.sufix */*/*/*/*/*.sufix
SRCS     = $(wildcard $(DIRS:%.sufix=%.cpp))
#SRCS     = $(wildcard *.cpp */*.cpp */*/*.cpp */*/*/*.cpp)
#SRCS     = main.cpp sample.cpp sub2/sub_sample.cpp sub2/sub/sub_sample.cpp sub/sub_sample.cpp
OBJS     = $(SRCS:%.cpp=%.o)
DEPS     = $(OBJS:%.o=%.d)

TARGET   = makefile_test.o
#FORMAT_F = $(wildcard *.cpp */*.cpp */*/*.cpp */*/*/*.cpp *.h */*.h */*/*.h */*/*/*.h)
FORMAT_F = $(wildcard $(DIRS:%.sufix=%.cpp) $(DIRS:%.sufix=%.h))

.cpp.o:
	$(CC) -c $^ -o $@ -MMD $(CFLAGS)

clean:
	-rm -f $(OBJS) $(TARGET) $(DEPS)

format: $(FORMAT_F)
	clang-format --style=file:.clang-format -i $^

setting:
	apt install $(CC) clang-format

$(TARGET): $(OBJS)
	$(CC) $^ -o $@ $(LIBDIR) $(LIBS) $(CFLAGS)

all: $(TARGET)

-include $(DEPS)