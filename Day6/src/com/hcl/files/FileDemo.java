package com.hcl.files;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File f1=new File("C:/java_hcl/Day1/Day6/src/com/hcl/ex/Custom.java");
        System.out.println("file name"+f1.getName());
        System.out.println("parent"+f1.getParent());
        System.out.println("path"+f1.getPath());
    }
    

}
