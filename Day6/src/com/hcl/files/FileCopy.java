package com.hcl.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        File src=new File("C:/java_hcl/Day1/Day6/src/com/hcl/ex/Custom.java");
        File tar=new File("c:/files/cpy.java");
        try {
            FileReader fr=new FileReader(src);
            FileWriter fw=new FileWriter(tar);
            int ch;
            while((ch=fr.read())!=-1){
                fw.write((char)ch);
        }
        fr.close();
        fw.close();
        System.out.println("*** file copied ***");
        }catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
