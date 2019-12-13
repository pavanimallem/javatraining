package com.hcl.ex;

public class ArrEx {
    public static void main(String[] args) {
        try {
            int[] a=new int[]{12,5};
            a[10]=6;
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO Auto-generated catch block
            System.out.println("array size is small");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
