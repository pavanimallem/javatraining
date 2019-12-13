package com.hcl.files1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Writestudent {
    public static void main(String[] args) {
        Student student=new Student(14,"mallem","pavani",8.5);
        try {
            FileOutputStream fout=new FileOutputStream("c:/files/student.txt");
            ObjectOutputStream objout=new ObjectOutputStream(fout);
            objout.writeObject(student);
            objout.close();
            fout.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
