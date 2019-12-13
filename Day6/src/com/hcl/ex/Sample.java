package com.hcl.ex;

class InvalidEmailException extends Exception{
    InvalidEmailException(String error){
        super(error);
    }
}
class InvalidUserException extends Exception{
    InvalidUserException(String error){
        super(error);
    }
}

public class Sample {
    public void check(String email) throws InvalidEmailException,InvalidUserException{
        boolean flag=true;
        if(email.indexOf('@')!=-1){
            flag=false;
            throw new InvalidEmailException("@ is missing");
            
        }
        
    }

}
