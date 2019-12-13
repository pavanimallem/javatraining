package com.hcl.abst;

abstract class Employ{
    int empno;
    String name;
    double salary;
    public Employ(int empno, String name, double salary) {
        super();
        this.empno = empno;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employ [empno=" + empno + ", name=" + name + ", salary="
                + salary + "]";
    }
    
    
}
class Sowmya extends Employ{

    public Sowmya(int empno, String name, double salary) {
        super(empno, name, salary);
        // TODO Auto-generated constructor stub
    }
    
}
class Nanditha extends Employ{

    public Nanditha(int empno, String name, double salary) {
        super(empno, name, salary);
        // TODO Auto-generated constructor stub
    }
    
}
public class AbsCon {
    public static void main(String[] args) {
        Employ[] arrEmploy=
            {
                new Sowmya(1,"sowmya",67455),
                new Nanditha(2,"nanditha",66333),
            };
        for (Employ employ : arrEmploy) {
            System.out.println(employ);
            
        }
    }
    

}
