package com.hcl.ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ChkDemo {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fin=new FileInputStream("c:/hello.txt");
    }

}
