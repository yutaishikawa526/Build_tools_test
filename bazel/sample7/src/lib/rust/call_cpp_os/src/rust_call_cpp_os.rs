
//#[link(name="liblib_cpp_os.so", kind="dylib")]
//#[link(name="lib_cpp_os", kind="dylib")]
extern "C" {
    pub fn lib_cpp_os();   
}

#[no_mangle]
pub extern "C" fn lib_rust_call_cpp_os() {
    println!("Call CPP OS! From Rust");
    unsafe{
        lib_cpp_os();
    }
}
