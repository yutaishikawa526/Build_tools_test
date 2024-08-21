#include "../cpp/cpp_animal.h"
#include "../cpp/cpp_os.h"
#include "../rust/country/src/rust_country.h"
#include "../rust/call_cpp_os/src/rust_call_cpp_os.h"

int main(){
    lib_cpp_animal();
    lib_cpp_os();
    lib_rust_country();
    lib_rust_call_cpp_os();
}
