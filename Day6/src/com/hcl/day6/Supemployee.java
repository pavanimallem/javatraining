package com.hcl.day6;

class HCLEmployee{
    String sapid;
    String name;
    String gender;
    String designation;
    public HCLEmployee(String sapid, String name, String gender,
            String designation) {
        super();
        this.sapid = sapid;
        this.name = name;
        this.gender = gender;
        this.designation = designation;
    }
    @Override
    public String toString() {
        return "HCLEmployee [sapid=" + sapid + ", name=" + name + ", gender="
                + gender + ", designation=" + designation + "]";
    }
    
    
}
class Harika extends HCLEmployee{

    public Harika(String sapid, String name, String gender, String designation) {
        super(sapid, name, gender, designation);
        // TODO Auto-generated constructor stub
    }
    
    
}
class Gayathri extends HCLEmployee{

    public Gayathri(String sapid, String name, String gender, String designation) {
        super(sapid, name, gender, designation);
        // TODO Auto-generated constructor stub
    }
    
}
class Anusha extends HCLEmployee{

    public Anusha(String sapid, String name, String gender, String designation) {
        super(sapid, name, gender, designation);
        // TODO Auto-generated constructor stub
    }
    
}

public class Supemployee {
    public static void main(String[] args) {
        HCLEmployee employeeHarika=new Harika("722", "Harika", "female", "software engineer");
        HCLEmployee employeeGayathri=new Gayathri("733", "Gayathri", "female", "software engineer");
        HCLEmployee employeeAnusha=new Anusha("744", "Anusha", "female", "software engineer");
        HCLEmployee[]
                arrHCL={employeeHarika,employeeGayathri,employeeAnusha};
        for (HCLEmployee hclEmployee : arrHCL) {
            System.out.println(hclEmployee);
            
        }
    }

}
