package com.hcl.intf;

interface IOne{
    void name();
}
interface ITwo{
    void email();
}
class Demo implements IOne,ITwo{

    @Override
    public void email() {
        // TODO Auto-generated method stub
        System.out.println("email hcl@gmail.com");
        
    }

    @Override
    public void name() {
        // TODO Auto-generated method stub
        System.out.println("company HCL");
        
    }
    
}

public class MultiInh {
    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.name();
        obj.email();
        
    }

}
