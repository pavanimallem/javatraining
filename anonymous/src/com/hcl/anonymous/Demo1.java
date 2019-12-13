package com.hcl.anonymous;

interface Itraining {
	void name();
	void email();
}
public class Demo1 {
	public static void main(String[] args) {
		Itraining obj=new Itraining() {
			
			@Override
			public void name() {
				System.out.println("name is hcl");
			}
			
			@Override
			public void email() {
				System.out.println("admin@hcl.com");
				
			}
		};
		obj.name();
		obj.email();
	}

}
