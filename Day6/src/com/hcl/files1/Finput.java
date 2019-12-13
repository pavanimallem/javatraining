package com.hcl.files1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Finput {
    public static void main(String[] args) {
        try {
            FileInputStream fin=new 
                    FileInputStream("C:/java_hcl/Day1/Day6/src/com/hcl/ex/Custom.java");
            int ch;
            while((ch=fin.read()) !=-1) {
                System.out.print((char)ch);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
