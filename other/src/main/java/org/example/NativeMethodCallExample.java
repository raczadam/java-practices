package org.example;

/**
 * Hello world!
 */
public class NativeMethodCallExample {


    /*
    TODO: include the rust code too (in a different package,
    TODO and modify the System.load script to use so in linux
    TODO and add relative path
     */


    static {
        //System.loadLibrary("hello");
        System.load("C:/Users/racza/git/rust-training/hello/target/release/hello.dll");
        System.out.println("library loaded");
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Call a native library...");
        System.out.println(palindrome("AAAAAb"));
        System.out.println("Success");

    }


    public static native boolean palindrome(String input);


}
