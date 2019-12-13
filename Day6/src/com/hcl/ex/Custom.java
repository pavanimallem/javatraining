package com.hcl.ex;

class NegativeException extends Exception{
    NegativeException(String error){
        super(error);
    }
}
class NumberZeroException extends Exception{
    NumberZeroException(String error){
        super(error);
    }
}

public class Custom  {
    public void add(int a,int b) throws NegativeException, NumberZeroException{
        boolean flag=true;
        if(a<0||b<0){
            flag=false;
            throw new NegativeException("negative nos not allowed");
        }
        if(a==0||b==0){
            flag=false;
            throw new NumberZeroException("zero is invalid");
        }
        if(flag==true){
            int c=a+b;
            System.out.println("sum is "+c);
        }
    }
    public static void main(String[] args) {
        try {
            new Custom().add(12, 0);
        } catch (NegativeException | NumberZeroException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

}
