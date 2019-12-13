package com.hcl.abst;

abstract class Student{
    int sno;
    String sname;
    double cgp;
    public Student(int sno, String sname, double cgp) {
        super();
        this.sno = sno;
        this.sname = sname;
        this.cgp = cgp;
    }
    @Override
    public String toString() {
        return "Student [sno=" + sno + ", sname=" + sname + ", cgp=" + cgp
                + "]";
    }
    
}
class Nandu extends Student{

    public Nandu(int sno, String sname, double cgp) {
        super(sno, sname, cgp);
        // TODO Auto-generated constructor stub
    }
    
}
class Anu extends Student{

    public Anu(int sno, String sname, double cgp) {
        super(sno, sname, cgp);
        // TODO Auto-generated constructor stub
    }
    
}

public class AbsStudent {
    public static void main(String[] args) {
        
    
    Student[] arrStudent=
        {
            new Nandu(1,"nandu",9.5),
            new Anu(2,"anu",9.4),
        };
    for (Student student : arrStudent) {
        System.out.println(student);
        
    }
   

}
}
