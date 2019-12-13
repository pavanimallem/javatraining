package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class Arrlistdemo {
    public static void main(String[] args) {
        List names=new ArrayList();
        names.add("pavani");
        names.add("suresh");
        names.add("sai");
        names.add("mom");
        names.add("mallem");
        System.out.println("names are ");
        for (Object ob : names) {
            System.out.println(ob);
        }
        names.add(2,"venkat");
        System.out.println("names after adding item ");
        for (Object ob : names) {
            System.out.println(ob);
            
        }
        names.set(3,"miss");
        System.out.println("names after edting..");
        for (Object ob : names) {
            System.out.println(ob);
            
        }
        names.remove("venkat");
        System.out.println("list after removing by object name");
        for (Object ob : names) {
            System.out.println(ob);
            
        }
        names.remove(2);
        System.out.println("list after removing by index ");
        for (Object ob : names) {
            System.out.println(ob);
            
        }
    }

}
