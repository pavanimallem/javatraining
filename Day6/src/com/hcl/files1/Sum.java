package com.hcl.files1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter 2 no ");
        try {
            int a=Integer.parseInt(br.readLine());
            int b=Integer.parseInt(br.readLine());
            int c=a+b;
            System.out.println("sum is " +c);         
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
