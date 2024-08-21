
extern crate base64;

use base64::{engine::general_purpose, Engine as _};

fn main() {
    println!("Hello, world!");
    println!("{:?}", general_purpose::STANDARD.encode("Hello, world!".as_bytes()));
}
