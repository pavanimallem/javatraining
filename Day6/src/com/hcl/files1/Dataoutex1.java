package com.hcl.files1;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Dataoutex1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fout=new FileOutputStream("c:/files/d1.txt");
            DataOutputStream dout =new DataOutputStream(fout);
            dout.writeInt(67);
            dout.writeInt(56);
            dout.close();
            dout.close();
            System.out.println("file created..");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
