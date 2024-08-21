#include <iostream>

#include "sample.h"
#include "sub/sub_sample.h"
#include "sub2/sub/sub_sample.h"
#include "sub2/sub_sample.h"

int main() {
    sample();
    sub_sample();
    sub_sample2();
    sub2_sub_sample();
}
