package com.hcl.files1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Reademploy {
    public static void main(String[] args) {
        Employ employ=null;
        try {
            FileInputStream fin=new FileInputStream("c:/files/employ.txt");
            ObjectInputStream objin=new ObjectInputStream(fin);
            employ=(Employ)objin.readObject();
            System.out.println(employ);
            objin.close();
            fin.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
