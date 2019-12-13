package com.hcl.abst;

abstract class HclTraining{
    abstract void loginTime();
    abstract void employeeName();
    abstract void logoutTime();
}
class Harika extends HclTraining{

    @Override
    void loginTime() {
        // TODO Auto-generated method stub
        System.out.println("came at 9.30 AM");
    }

    @Override
    void employeeName() {
        // TODO Auto-generated method stub
        System.out.println("hi i am Harika");
        
    }

    @Override
    void logoutTime() {
        // TODO Auto-generated method stub
        System.out.println("will go by 8.30 PM");
        
    }
    
}

class Mounika extends HclTraining{

    @Override
    void loginTime() {
        // TODO Auto-generated method stub
        System.out.println("mounika came by 7.30 AM");
        
    }

    @Override
    void employeeName() {
        // TODO Auto-generated method stub
        System.out.println("hi i am mounika");
        
    }

    @Override
    void logoutTime() {
        // TODO Auto-generated method stub
        System.out.println("will go by 8.30 PM");
        
    }
    
}
public class AbsDemo {
    public static void main(String[] args) {
        HclTraining[] arrTraining=
            {
                new Harika(),
                new Mounika(),
            };
        for (HclTraining hclTraining : arrTraining) {
            hclTraining.employeeName();
            hclTraining.loginTime();
            hclTraining.logoutTime();
            
            
        }
        
    }

}
