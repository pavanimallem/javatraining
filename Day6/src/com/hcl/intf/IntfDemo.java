package com.hcl.intf;

interface ITraining{
    void name();
    void email();
    
}
class Niharika implements ITraining{

    @Override
    public void name() {
        // TODO Auto-generated method stub
        System.out.println("name is niharika");
        
    }

    @Override
    public void email() {
        // TODO Auto-generated method stub
        System.out.println("email niharika@gmail.com");
        
    }
    
}
class jaya implements ITraining{

    @Override
    public void name() {
        // TODO Auto-generated method stub
        System.out.println("name is jaya");
        
    }

    @Override
    public void email() {
        // TODO Auto-generated method stub
        System.out.println("emailjaya@gmail.com");
        
    }
    
}

public class IntfDemo {
    public static void main(String[] args) {
        ITraining[] arrTraining=
            {
                new Niharika(),
                new jaya(),
            };
        for (ITraining iTraining : arrTraining) {
            iTraining.name();
            iTraining.email();
            
        }
    }

}
