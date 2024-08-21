CC       = clang

SRCS     = sub_sample.cpp
#SRCS     = $(shell find . -mindepth 1 -maxdepth 1 -type f | grep -E '.+\.cpp$$')
OBJS     = $(SRCS:.cpp=.o)

$(OBJS): $(SRCS)
	$(CC) $(INCDIR) -c $^

compile: $(OBJS)
	find . -mindepth 2 -maxdepth 2 -type f | grep -E '^.*/Makefile$$' | xargs -I subD bash -c 'cd `dirname subD`; make compile'

clean:
	-rm -f $(OBJS)
	find . -mindepth 2 -maxdepth 2 -type f | grep -E '^.*/Makefile$$' | xargs -I subD bash -c 'cd `dirname subD`; make clean'
