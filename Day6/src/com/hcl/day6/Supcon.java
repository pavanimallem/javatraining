package com.hcl.day6;


class First {
  int sno;
  String name;
  
  public First(int sno, String name) {
    super();
    this.sno = sno;
    this.name = name;
  }
  
  @Override
    public String toString() {
    return "First [sno=" + sno + ", name=" + name + "]";
  }
    


 class Second extends First {

  public Second(int sno, String name) {
    super(sno, name);
    // TODO Auto-generated constructor stub
  }
    
}
}

public class Supcon {
  public static void main(String[] args) {
    First obj = new First(1, "harika");
    System.out.println(obj);
  }

}
